num1 = int(input("Enter start number: "))
num2 = int(input("Enter end number: "))
ans = []

for i in range(num1, num2+1):
    flag = 0

    if i < 2:
        continue
    if i == 2:
        ans.append(2)
        continue

    for j in range(2, i):
        if i%j == 0:
            flag = 1
            break
    
    if flag == 0:
        ans.append(i)

print("The Prime Numbers for given range is: ", ans)