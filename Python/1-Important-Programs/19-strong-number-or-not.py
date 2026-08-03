import math

num = int(input("Enter a number: "))
temp = num
ans = 0

while num > 0:
    digit = num%10
    ans += math.factorial(digit)
    num = num//10

if ans == temp:
    print(temp, "is a Strong Number")
else:
    print(temp, "is Not a Strong Number")


# Using for loop for factorial

# num = int(input("Enter a number: "))
# temp = num
# ans = 0

# while num > 0:
#     digit = num%10
#     fact = 1

#     for i in range(1, digit+1):
#         fact = fact * i

#     ans += fact
#     num = num//10

# if ans == temp:
#     print(temp, "is Strong number.")
# else:
#     print(temp, "is Not Strong number.")