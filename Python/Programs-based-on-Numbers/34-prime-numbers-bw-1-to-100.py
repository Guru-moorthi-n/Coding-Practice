num1 = 2
num2 = 100

for i in range(num1, num2+1):
    flag = True

    for j in range(2, i):
        if i%j == 0:
            flag = False
            break
        
    if flag:
        print(i, end=" ")