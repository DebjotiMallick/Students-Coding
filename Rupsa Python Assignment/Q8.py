def factorial(n):
    fact=1
    while(n>0):
        fact=fact*n
        n=n-1
    return fact


n=int(input("Enter number:"))
print("Factorial of the number is:", factorial(n))