n=int(input("Enter value of n: "))

def seriesSum(n):
    result = 0
    for i in range(0, n+1):
        result += 1 / 2**i
    return result

print(f"Sum is {seriesSum(n)}")