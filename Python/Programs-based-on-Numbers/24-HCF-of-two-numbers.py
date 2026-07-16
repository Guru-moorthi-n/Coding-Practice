num1 = int(input("Enter first number: "))
num2 = int(input("Enter Second number: "))

while num2 != 0:
    num1, num2 = num2, num1 % num2

print("\nHCF is:", num1)


# Using for loop 
# hcf = 1
# for i in range(1, (min(num1,num2)+1)):
#     if (num1%i == 0) and (num2%i == 0):
#         hcf = i

# print("\nHCF is:", hcf)