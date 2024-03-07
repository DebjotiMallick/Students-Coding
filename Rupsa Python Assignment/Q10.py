x = []
y1 = []
y2 = []
with open('Q9.txt') as f:
    for line in f:
        row = line.split(",")
        x.append(row[0])
        y1.append(row[1])
        y2.append(row[2])
f.close()

for i in range(0,len(x)):
    y1[i] = float(y1[i]) + float(y2[i])
    s = f"{x[i]},{y1[i]}"
    with open('Q10.txt', 'a') as f:
        f.write(s)
        f.write('\n')
