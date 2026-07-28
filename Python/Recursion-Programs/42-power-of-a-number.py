base = int(input("Enter base value: "))
exponent = int(input("Enter exponent value: "))

def Power(base, exponent):
    if (exponent == 0):
        return 1
    else:
        return base * Power(base, exponent-1)

print("\nThe answer is: ", Power(base, exponent))