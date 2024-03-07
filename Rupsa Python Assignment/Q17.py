def scalar(A, k):
    for row in A:
        for val in row:
            val = val * k
        #     print(round(val,5), end=' ')
        # print()
    return A


A = [[-12.4, 3.37, -22.83], [14.94, -26.28, -41.28]]
B = scalar(A, 2.95)
for row in B:
    for val in row:
        print(val, end=' ')
    print()