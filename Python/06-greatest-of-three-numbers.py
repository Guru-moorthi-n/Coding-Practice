num1 = int(input("Enter first number: "))
num2 = int(input("Enter second number: "))
num3 = int(input("Enter third number: "))

if (num1 == num2 == num3):
    print("\nAll are equal.")
elif (num1 >= num2) and (num1 >= num3):
    print("\nGreatest Number:", num1)
elif(num2 >= num1) and (num2 >= num3):
    print("\nGreatest Number:", num2)
else:
    print("\nGreatest Number:", num3)


# Using pre-built Function
print(max(num1, num2, num3))