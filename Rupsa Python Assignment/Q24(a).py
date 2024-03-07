n=int(input("Enter value of n: "))

def seriesSum(n):
    result = 0
    for i in range(1, n+1):
        result += i
    return result

formulaSum = n*(n+1) / 2

if formulaSum == seriesSum(n):
    print("Verified")