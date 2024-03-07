import math as m
n=int(input("Enter value of n: "))

x = round(m.log(2), 3)
print(f"value of ln 2 is {x}")

def seriesSum(t):
    result=0
    for i in range(1, t+1):
        result += (1/((2*i-1)*2*i))
    return result

sum1 = round(seriesSum(n),3)
print(f"Sum of series is {sum1}")

if(x==sum1):
    print("equal")
else:
    print("not equal")