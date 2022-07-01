import java.util.*;

public class Driver {

    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);

        System.out.print("Enter string to encode:");
        String load = s.nextLine();
        System.out.println(fullURLEncode(load));
        System.out.println(URLEncode(load));
        System.out.println(doubleURLEncode(load));
    }

    public static String fullURLEncode(String s) {
        char[] str = s.toLowerCase().toCharArray();

        String encoded = "";


        for(int i = 0; i < str.length; i++) {
            char c = str[i];

            switch(c) {
                case 'a':
                    encoded += "%61";
                    break;
                case 'b':
                    encoded += "%62";
                    break;
                case 'c':
                    encoded += "%63";
                    break;
                case 'd':
                    encoded += "%64";
                    break;
                case 'e':
                    encoded += "%65";
                    break;
                case 'f':
                    encoded += "%66";
                    break;
                case 'g':
                    encoded += "%67";
                    break;
                case 'h':
                    encoded += "%68";
                    break;
                case 'i':
                    encoded += "%69";
                    break;
                case 'j':
                    encoded += "%6A";
                    break;
                case 'k':
                    encoded += "%6B";
                    break;
                case 'l':
                    encoded += "%6C";
                    break;
                case 'm':
                    encoded += "%6D";
                    break;
                case 'n':
                    encoded += "%6E";
                    break;
                case 'o':
                    encoded += "%6F";
                    break;
                case 'p':
                    encoded += "%70";
                    break;
                case 'q':
                    encoded += "%71";
                    break;
                case 'r':
                    encoded += "%72";
                    break;
                case 's':
                    encoded += "%73";
                    break;
                case 't':
                    encoded += "%74";
                    break;
                case 'u':
                    encoded += "%75";
                    break;
                case 'v':
                    encoded += "%76";
                    break;
                case 'w':
                    encoded += "%77";
                    break;
                case 'x':
                    encoded += "%78";
                    break;
                case 'y':
                    encoded += "%79";
                    break;
                case 'z':
                    encoded += "%7A";
                    break;
                case ' ':
                    encoded += "%20";
                    break;
                case '!':
                    encoded += "%21";
                    break;
                case '\"':
                    encoded += "%22";
                    break;
                case '#':
                    encoded += "%23";
                    break;
                case '$':
                    encoded += "%24";
                    break;
                case '%':
                    encoded += "%25";
                    break;
                case '&':
                    encoded += "%26";
                    break;
                case '\'':
                    encoded += "%27";
                    break;
                case '(':
                    encoded += "%28";
                    break;
                case ')':
                    encoded += "%29";
                    break;
                case '*':
                    encoded += "%2A";
                    break;
                case '+':
                    encoded += "%2B";
                    break;
                case ',':
                    encoded += "%2C";
                    break;
                case '-':
                    encoded += "%2D";
                    break;
                case '.':
                    encoded += "%2E";
                    break;
                case '/':
                    encoded += "%2F";
                    break;
                case '0':
                    encoded += "%30";
                    break;
                case '1':
                    encoded += "%31";
                    break;
                case '2':
                    encoded += "%32";
                    break;
                case '3':
                    encoded += "%33";
                    break;
                case '4':
                    encoded += "%34";
                    break;
                case '5':
                    encoded += "%35";
                    break;
                case '6':
                    encoded += "%36";
                    break;
                case '7':
                    encoded += "%37";
                    break;
                case '8':
                    encoded += "%38";
                    break;
                case '9':
                    encoded += "%39";
                    break;
                case ':':
                    encoded += "%3A";
                    break;
                case ';':
                    encoded += "%3B";
                    break;
                case '<':
                    encoded += "%3C";
                    break;
                case '=':
                    encoded += "%3D";
                    break;
                case '>':
                    encoded += "%3E";
                    break;
                case '?':
                    encoded += "%3F";
                    break;
                case '@':
                    encoded += "%40";
                    break;
                case '[':
                    encoded += "%5B";
                    break;
                case '\\':
                    encoded += "%5C";
                    break;
                case '^':
                    encoded += "%5D";
                    break;
                case '_':
                    encoded += "%5F";
                    break;
                case '{':
                    encoded += "%7B";
                    break;
                case '|':
                    encoded += "%7C";
                    break;
                case '}':
                    encoded += "%7D";
                    break;
                case '~':
                    encoded += "%7E";
                    break;
                default:
                    encoded += "";
                    break;
            }

        }
        return encoded;
    }

    public static String URLEncode(String s) {
        char[] str = s.toLowerCase().toCharArray();

        String encoded = "";


        for(int i = 0; i < str.length; i++) {
            char c = str[i];

            switch (c) {
                case ' ':
                    encoded += "%20";
                    break;
                case '!':
                    encoded += "%21";
                    break;
                case '\"':
                    encoded += "%22";
                    break;
                case '#':
                    encoded += "%23";
                    break;
                case '$':
                    encoded += "%24";
                    break;
                case '%':
                    encoded += "%25";
                    break;
                case '&':
                    encoded += "%26";
                    break;
                case '\'':
                    encoded += "%27";
                    break;
                case '(':
                    encoded += "%28";
                    break;
                case ')':
                    encoded += "%29";
                    break;
                case '*':
                    encoded += "%2A";
                    break;
                case '+':
                    encoded += "%2B";
                    break;
                case ',':
                    encoded += "%2C";
                    break;
                case '-':
                    encoded += "%2D";
                    break;
                case '.':
                    encoded += "%2E";
                    break;
                case '/':
                    encoded += "%2F";
                    break;
                case '0':
                    encoded += "%30";
                    break;
                case '1':
                    encoded += "%31";
                    break;
                case '2':
                    encoded += "%32";
                    break;
                case '3':
                    encoded += "%33";
                    break;
                case '4':
                    encoded += "%34";
                    break;
                case '5':
                    encoded += "%35";
                    break;
                case '6':
                    encoded += "%36";
                    break;
                case '7':
                    encoded += "%37";
                    break;
                case '8':
                    encoded += "%38";
                    break;
                case '9':
                    encoded += "%39";
                    break;
                case ':':
                    encoded += "%3A";
                    break;
                case ';':
                    encoded += "%3B";
                    break;
                case '<':
                    encoded += "%3C";
                    break;
                case '=':
                    encoded += "%3D";
                    break;
                case '>':
                    encoded += "%3E";
                    break;
                case '?':
                    encoded += "%3F";
                    break;
                case '@':
                    encoded += "%40";
                    break;
                case '[':
                    encoded += "%5B";
                    break;
                case '\\':
                    encoded += "%5C";
                    break;
                case '^':
                    encoded += "%5D";
                    break;
                case '_':
                    encoded += "%5F";
                    break;
                case '{':
                    encoded += "%7B";
                    break;
                case '|':
                    encoded += "%7C";
                    break;
                case '}':
                    encoded += "%7D";
                    break;
                case '~':
                    encoded += "%7E";
                    break;
                default:
                    encoded += str[i];
                    break;
            }
        }
        return encoded;
    }

    public static String doubleURLEncode(String s) {
        char[] str = s.toLowerCase().toCharArray();

        String encoded = "";

        for (int i = 0; i < str.length; i++){
            if(str[i] == '%'){
                encoded += "%25";
            }else{
                encoded += str[i];
            }
        }

        return encoded;
    }
}

