import math as m

def factorial(a):
    fac=1
    for i in range(1,a+1):
      fac=fac*i
    return fac

def sum(x,y):
    k=1
    v=0.75
    while True:
        if abs(x-y)>=10**-10:
          y+=(-1)**(k+1)*(v**k)/k
          k+=1
        else:
         break

    return y

a=m.log(1+0.75)
print(a)
b=0
print(sum(a,b))