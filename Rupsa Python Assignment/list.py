# numlist=[2,4,6,8,-2]
# sum=0
# for i in numlist:
#     sum+=i
# print("Sum :",sum)

dict = {'name1': 'Sam', 'name2': 'Paul', 'name3': 'John', 'name4': 'Sam'}

result = {}

for key,value in dict.items():
    if value not in result.values():
        result[key] = value

print("Result :",result)