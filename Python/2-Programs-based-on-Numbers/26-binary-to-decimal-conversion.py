binary = input("Enter Binary number: ")
decimal = 0
power = 0

for digit in binary[::-1]:
    decimal += int(digit) * (2**power)
    power += 1

print("\nDecimal value is:", decimal)


# Using built-in method
#  decimal = int(binary, 2)