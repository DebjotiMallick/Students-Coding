#Bisection 
from math import *
def f(x):
    return x**2-1
def bisection (a,b):
    while abs (b-a)> 1e-5 :
        s= (a+b)/2
        if f(a)*f(s)<0:
            b=s
        else:
            a=s
    return s

a,b=-5,5
dx=0.2
x=a
while x<=b:
    x+=dx
    if f(x-dx)*f(x)<0:
        root= bisection(x-dx,x)
        print(root)        
