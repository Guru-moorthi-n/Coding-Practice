num = int(input("Enter a number: "))
temp = num
digit, ans = 0, 0
length = len(str(num))

while num > 0:
    digit = num%10
    ans += pow(digit, length)
    num = num//10

if (ans == temp):
    print(temp, "is Armstrong number.")
else:
    print(temp, "is Not a Armstrong number.")