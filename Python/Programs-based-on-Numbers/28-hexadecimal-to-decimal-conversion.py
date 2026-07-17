hexa = input("Enter Hexadecimal number: ").upper()

decimal = 0
power = 0

for digit in hexa[::-1]:
    if '0' <= digit <= '9':
        value = int(digit)
    else:
        value = ord(digit) - ord('A')+10

    decimal += value * (16 ** power)
    power += 1

print("Decimal value is:", decimal)


# Using built-in method
# decimal = int(hexa, 16)