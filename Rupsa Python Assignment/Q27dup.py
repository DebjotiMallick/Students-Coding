import math as m

def factorial(a):
    fac=1
    for i in range(1,a+1):
      fac=fac*i
    return fac

def sum(x,y):
    k=0
    v=0.75
    while True:
        if abs(x-y)>=10**-2:
          y+=float((v**k))/float(factorial(k))
          k+=1
        else:
         break

    return y

a=m.exp(0.75)
b=0
print(sum(a,b))