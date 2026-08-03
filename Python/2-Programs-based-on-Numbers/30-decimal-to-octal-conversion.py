decimal = int(input("Enter Decimal number: "))
octal = ""

if decimal == 0:
    print("Octal value is: 0")

else:
    while decimal > 0:
        remainder = decimal%8
        octal = str(remainder) + octal
        decimal = decimal//8
    
    print("Octal value is:", octal)


# Using built-in method
# octal = oct(decimal)