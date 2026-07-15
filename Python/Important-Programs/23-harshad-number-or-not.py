num = int(input("Enter a number: "))
temp = num
sum = 0

while(num>0):
    sum += num%10
    num = num//10

if(temp%sum == 0):
   print("Yes, it's a harshad Number")
else:
    print("No, it's not a harshad Number")