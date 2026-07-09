num1 = int(input("Enter first number: "))
num2 = int(input("Enter second number: "))

if num1 == num2:
    print("Both are equal.")
elif num1 > num2:
    print("\nGreatest number is:", num1)
else:
    print("\nGreatest number is:", num2)

 
# Using pre-built Function
print(max(num1, num2)) 