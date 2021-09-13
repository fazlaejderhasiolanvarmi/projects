def checkList(l):
    ele = l[0]
    chk = True

    for item in l:
        if ele != item:
            chk = False
            break

    return chk


def initTable(x):
    a = [[0 for i in range(x)] for j in range(x)]

    c = 0
    for i in range(len(a)):
        for j in range(len(a[i])):
            a[i][j] = c
            c += 1

    return a


def printTable(arr):
    for i in range(len(arr)):
        for j in range(len(arr[i])):
            print(arr[i][j], end="\t")
        print()

    print()


def checkRows(arr):
    r = False
    row = []
    for i in range(len(arr)):

        for j in range(len(arr[i])):
            row.append(arr[i][j])

        r = checkList(row)
        row.clear()
        if r:
            break

    return r


def checkColumns(arr):
    r = False
    col = []
    for i in range(len(arr)):
        for j in range(len(arr[i])):
            col.append(arr[j][i])

        r = checkList(col)
        col.clear()
        if r:
            break

    return r


def checkFirstDiagonal(arr):
    r = False
    diag = []
    for i in range(len(arr)):
        for j in range(len(arr[i])):
            if i == j:
                diag.append(arr[i][j])

    r = checkList(diag)
    return r


def checkSecondDiagonal(arr):
    r = False
    diag = []
    for i in range(len(arr)):
        for j in range(len(arr[i])):
            if i + j == len(arr) - 1:
                diag.append(arr[i][j])

    r = checkList(diag)
    return r


def checkTable(arr):
    return checkRows(arr) or checkFirstDiagonal(arr) or checkColumns(arr) or checkSecondDiagonal(arr)


def insertInput(arr, val, char):
    flag = False

    while val < 0 or val > x * x:
        val = int(input("Invalid input! Please enter valid cell number! -->"))

    while flag is False:
        for i in range(len(arr)):
            for j in range(len(arr[i])):
                if (i * len(arr) + j) == val:
                    if arr[i][j] == 'X' or arr[i][j] == 'O':
                        if char == arr[i][j]:
                            val = int(input('You made this choice before, please enter new cell. --> '))
                        else:
                            val = int(input('Other player has made this choice, please enter new cell. --> '))
                    else:
                        arr[i][j] = char
                        flag = True


x = input("Size of the game? ")
x = int(x)

print()
a = initTable(x)
print("Game Begins!\n")
printTable(a)

gameOver = False
count = 0

while gameOver is False and count < x * x:
    if count % 2 == 0:
        inp = input("Nane's (X) turn --> ")
        insertInput(a, int(inp), 'X')
        printTable(a)
        gameOver = checkTable(a)
    else:
        inp = input("Kekik's (O) turn --> ")
        insertInput(a, int(inp), 'O')
        printTable(a)
        gameOver = checkTable(a)

    if gameOver:
        if count % 2 == 0:
            print('Nane wins!')
        else: #count tek ise
            print('Kekik wins!')

    count += 1

if gameOver is False:
    print('Draw!')
