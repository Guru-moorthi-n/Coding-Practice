binary = input("Enter Binary number: ")

decimal = int(binary, 2)
octal = oct(decimal)[2:]

print("\nOctal value is:", octal)