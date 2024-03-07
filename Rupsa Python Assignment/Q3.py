n = int(input("Enter an integer: "))

while(n != 1):
    if(n % 2 == 0):
        n /= 2
        print(int(n))
    else:
        n = n * 3 + 1
        print(int(n))