A=[[-2.4,3.27],[1.64,-6.28]]
Apower=[[-2.4,3.27],[1.64,-6.28]]
result=[[0,0],[0,0]]
I=[[1,0],[0,1]]

def factorial(a):
    fac=1
    for i in range(1,a+1):
      fac=fac*i
    return fac

def multiply(X, Y):
    temp=[[0,0],[0,0]]
    for i in range(len(X)):
        for j in range(len(Y[0])):
            for k in range(len(Y)):
                temp[i][j] += X[i][k] * Y[k][j]
    return temp

def scalar(A, k):
    temp=[[0,0],[0,0]]
    for i in range(len(A)):
        for j in range(len(A[0])):
            temp[i][j] = A[i][j] / k
    return temp

def addition(A, B):
    for i in range(len(A)):
        for j in range(len(A[0])):
            result[i][j] = A[i][j] + B[i][j]

for i in range(2,6):
    Apower=multiply(Apower,A)
    f=factorial(i)
    addition(result,scalar(Apower,f))
    
addition(result, A)
addition(result, I)

for row in result:
    for val in row:
        print(val, end=' ')
    print()