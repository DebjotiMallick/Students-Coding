A = [[-2.4, 3.27, -2.86], [1.64, -6.28, -4.28]]
B = [[4.72, 2.39, -0.89], [-7.27, -1.67, 7.92]]
add = [[0,0,0], [0,0,0]]
sub = [[0,0,0], [0,0,0]]


def addition(A, B):
    for i in range(len(A)):
        for j in range(len(A[0])):
            add[i][j] = A[i][j] + B[i][j]

            print(round(add[i][j],2),end=' ')
        print()
def subtract(A, B):
    for i in range(len(A)):
        for j in range(len(A[0])):
            sub[i][j] = A[i][j] - B[i][j]

            print (round(sub[i][j],2),end=' ')
        print()
 #(print("Addition:")
addition(A, B)
# for row in add:
#     for val in row:
#         print(round(val,2), end=' ')
#     print()

# print("\nSubtraction:")
subtract(A, B)
# for row in sub:
#     for val in row:
#         print(round(val,2), end=' ')
#     print())