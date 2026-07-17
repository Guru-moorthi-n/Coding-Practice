octal = input("Enter Octal number: ")
decimal = 0
power = 0

for digit in octal[::-1]:
    decimal += int(digit) * (8**power)
    power += 1

print("Decimal value is:", decimal)


# Using built-in method
# decimal = int(octal, 8)