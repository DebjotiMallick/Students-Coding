def func(a, b, x):
    f = a + b * x * x
    return f

for i in range(-20, 21, 1):
    x = i / 10
    y1 = func(0.2, -0.5, x)
    y2 = func(-2.2, -0.5, x)
    s = f"{x},{y1},{y2}"
    with open('Q9.txt', 'a') as f:
        f.write(s)
        f.write('\n')