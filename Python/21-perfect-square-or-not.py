import math

num = int(input("Enter a number: "))
root = int(math.sqrt(num))
# root = int(num ** 0.5)

if (root*root == num):
    print(num, "is Perfect Square.")
else:
    print(num, "is Not Perfect Square.")