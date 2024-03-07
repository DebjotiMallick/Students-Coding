n = int(input("Enter an integer: "))
num_list = []

while(n != 1):
    if(n % 2 == 0):
        n /= 2
        num_list.append(int(n))
    else:
        n = n * 3 + 1
        num_list.append(int(n))


print(num_list)