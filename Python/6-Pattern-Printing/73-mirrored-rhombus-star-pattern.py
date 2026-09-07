num1 = int(input("Enter first number: "))
num2 = int(input("Enter second number: "))

for i in range(num1):
    print((" " * (num1-i-1)) + ("*")*num2)