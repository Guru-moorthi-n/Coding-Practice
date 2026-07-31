num1 = int(input("Enter first number: "))
num2 = int(input("Enter second number: "))

def HCF(num1, num2):
    if num2 == 0:
        return num1
    return HCF(num2, num1%num2)

def LCM(num1, num2):
    return (num1*num2)//HCF(num1, num2)

print("\nLCM is:", LCM(num1, num2))