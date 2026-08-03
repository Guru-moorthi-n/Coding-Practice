octal = input("Enter Octal number: ")

decimal = int(octal, 8)
binary = bin(decimal)[2:]

print("Octal value is:", binary)