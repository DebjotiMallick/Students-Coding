x=[]
y=[]

with open('Q29.dat') as f:
    for line in f:
        row = line.split(",")
        x.append(row[0])
        y.append(row[1].strip())
f.close()

n=len(x)

sumXY = 0.0
sumX = 0.0
sumY = 0.0
sumX2 = 0.0
for i in range(0,n):
    sumXY = sumXY + float(x[i]) * float(y[i])
    sumX = sumX + float(x[i])
    sumY = sumY + float(y[i])
    sumX2 = sumX2 + pow(float(x[i]), 2) 

print(f"{sumXY}, {sumX}, {sumY}, {sumX2}")

b = (n * sumXY - sumX * sumY) / (n * sumX2 - pow(sumX, 2))

a = (sumY - b * sumX) / n
print(b)
print(a)