num = int(input("Enter a number: "))

def Factorial(num):
    if num == 1:
        return 1
    elif num <= 0:
        return "Invalid inputs."
    else:
        return num * Factorial(num - 1)

print("Factorial:", Factorial(num))