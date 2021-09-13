from abc import ABC
import cv2
import numpy as np
import imutils

video_file = ''
WIDTH = 600
ONLY_MAX = False


def callback_val(x):
    pass


class TennisBallDetect(ABC):
    def get_ball_number(self):
        pass

    def get_ball_coordinates(self):
        pass


class RegionNumber(TennisBallDetect):
    GREEN_RANGE = ((29, 86, 6), (64, 255, 255))
    colorLower, colorUpper = GREEN_RANGE

    def __init__(self, frame):
        self.__frame = frame
        self.__mask = None
        self.__contours = []
        self.__filtered_list = []

        self.calculate_mask()
        self.calculate_contours()
        self.filter_circles()

    def get_ball_number(self):
        return len(self.__filtered_list)

    def get_ball_coordinates(self):
        coord = []
        for area in self.__filtered_list:
            coord.append(area[0][0][0])

        return coord

    def get_circle_details(circle):
        return cv2.minEnclosingCircle(circle)  # returns ((x, y), radius)

    def centroid(self):
        coord = []
        for circle in self.__filtered_list:
            coord.append(RegionNumber.get_circle_details(circle)[0])

        return coord

    def convert_rgb_to_hsv(self):
        blur = cv2.GaussianBlur(self.__frame, (1, 1), 0)
        return cv2.cvtColor(blur, cv2.COLOR_BGR2HSV)

    def get_frame(self):
        return self.__frame

    def calculate_mask(self):
        mask = cv2.inRange(self.convert_rgb_to_hsv(), RegionNumber.colorLower, RegionNumber.colorUpper)
        self.__mask = cv2.GaussianBlur(mask, (1, 1), 0)

    def calculate_contours(self):
        self.__contours = cv2.findContours(self.__mask.copy(), cv2.RETR_EXTERNAL, cv2.CHAIN_APPROX_SIMPLE)[-2]

    def filter_circles(self):
        for area in self.__contours:
            if RegionNumber.get_circle_details(area)[1] > 15:
                self.__filtered_list.append(area)

    def draw_circles(self):
        c = 0

        for circle in self.__filtered_list:
            c += 1
            ((x, y), radius) = RegionNumber.get_circle_details(circle)
            cv2.circle(self.__frame, (int(x), int(y)), int(radius), (0, 255, 255), 3)
            # Put coordinates of the center to the frame
            cv2.putText(self.__frame, str((int(x), int(y))), (int(x), int(y)), cv2.FONT_HERSHEY_SIMPLEX, 0.5, (175, 0, 175), 2, cv2.LINE_AA)
            # Put area of the circle to the frame
            cv2.putText(self.__frame, str(int(cv2.contourArea(circle))), (int(x), int(y) + int(radius) + 20), cv2.FONT_HERSHEY_SIMPLEX, 0.5, (255, 255, 255), 2, cv2.LINE_AA)
            # Put number of circle in the frame
            cv2.putText(self.__frame, str(c), (int(x), int(y) - int(radius) - 20), cv2.FONT_HERSHEY_SIMPLEX, 0.5, (255, 255, 255), 2, cv2.LINE_AA)

        cv2.putText(self.__frame, str(c), (50, 50), cv2.FONT_HERSHEY_SIMPLEX, 1, (255, 255, 255), 2, cv2.LINE_AA)
        cv2.imshow("Project", self.__frame)


if __name__ == '__main__':
    cam = cv2.VideoCapture(0)

    cv2.namedWindow("Term Project")

    cv2.createTrackbar("LH", "Term Project", 28, 255, callback_val)
    cv2.createTrackbar("UH", "Term Project", 95, 255, callback_val)
    cv2.createTrackbar("LS", "Term Project", 65, 255, callback_val)
    cv2.createTrackbar("US", "Term Project", 255, 255, callback_val)
    cv2.createTrackbar("LV", "Term Project", 178, 255, callback_val)
    cv2.createTrackbar("UV", "Term Project", 255, 255, callback_val)

    while True:

        (okay, image) = cam.read()

        l_h = cv2.getTrackbarPos("LH", "Term Project")
        l_s = cv2.getTrackbarPos("LS", "Term Project")
        l_v = cv2.getTrackbarPos("LV", "Term Project")

        u_h = cv2.getTrackbarPos("UH", "Term Project")
        u_s = cv2.getTrackbarPos("US", "Term Project")
        u_v = cv2.getTrackbarPos("UV", "Term Project")

        GREEN_RANGE = ((l_h, l_s, l_v), (u_h, u_s, u_v))
        RegionNumber.colorLower, RegionNumber.colorUpper = GREEN_RANGE

        if okay:
            tennis = RegionNumber(image)
            tennis.draw_circles()
            key = cv2.waitKey(1) & 0xFF
            if key == ord('q'):
                break
        else:
            print('Capture failed')
            break

    cam.release()
    cv2.destroyAllWindows()