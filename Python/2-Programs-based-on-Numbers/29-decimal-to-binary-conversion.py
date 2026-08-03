decimal = int(input("Enter Decimal number: "))
binary = ""

if decimal == 0:
    print("Binary value is: 0")

else:
    while decimal > 0:
        remainder = decimal%2
        binary = str(remainder) + binary
        decimal = decimal//2

    print("Binary value is:", binary)


# Using built-in method:
# binary = bin(decimal)[2:]
# print(binary)