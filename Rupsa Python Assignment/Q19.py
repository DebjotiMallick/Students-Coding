X = [[-2.4, 3.27, -2.86],
    [1.64, -6.28, -4.28]]

Y = [[4.72, 2.39],
    [-7.27, -1.67],
    [-2.81, 1.56]]

result = [[0,0,0],
         [0,0,0]]

def multiply(X, Y):
    for i in range(len(X)):
        for j in range(len(Y[0])):
            for k in range(len(Y)):
                result[i][j] += X[i][k] * Y[k][j]

multiply(X, Y)
for row in result:
    for val in row:
        print(round(val,2), end=' ')
    print()
