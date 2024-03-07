import math

x=0.75

lhs = math.exp(x)
lhs = round(lhs,2)

rhs = 0

def factorial(a):
    fac=1
    for i in range(1,a+1):
      fac=fac*i
    return fac

for i in range(0, 100):
    rhs += x ** i / factorial(i)

rhs = round(rhs,2)

if lhs == rhs:
    print("Verified")