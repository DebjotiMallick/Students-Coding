def permutation(n,k):
    return (factorial(n)/factorial(n-k))

def combination(n,k):
    return (factorial(n)/(factorial(n-k)*factorial(k)))

def factorial(a):
    fac=1
    for i in range(1,a+1):
      fac=fac*i
    return fac

print(permutation(5, 3))
print(combination(5, 3))