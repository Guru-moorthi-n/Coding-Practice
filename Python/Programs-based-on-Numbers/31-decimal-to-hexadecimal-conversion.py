decimal = int(input("Enter Decimal number: "))
hexadigits = "0123456789ABCDEF"
hexa = ""

if decimal == 0:
    print("Hexadecimal value is: 0")

else:
    while decimal > 0:
        hexa = hexadigits[decimal%16] + hexa
        decimal //= 16

    print("Hexadecimal value is:", hexa)

# Using built-in method
# hexa = hex(decimal)[2:].upper()