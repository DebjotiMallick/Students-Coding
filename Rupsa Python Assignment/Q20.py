result = [[0,0],
         [0,0]]

def multiply(X, Y):
    for i in range(len(X)):
        for j in range(len(Y[0])):
            for k in range(len(Y)):
                result[i][j] += X[i][k] * Y[k][j]

def scalar(A, k):
    for row in A:
        for val in row:
            val = val * k
            print(round(val,2), end=' ')
        print()

A = [[4.23, -2.39], [-5.27, -1.67]]

print("First answer:")
multiply(A, A)
scalar(result, 1.2)

print("\nSecond answer:")
multiply(result, A)
scalar(result, 3.2)

print("\nThird answer:")
multiply(result, A)
scalar(result, 2)