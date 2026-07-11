num = int(input("Enter a number: "))
reverse = 0

while num > 0:
    remainder = num % 10
    reverse = (reverse * 10) + remainder
    num = num // 10

print("Reverse number is:", reverse)

# Using String Slicing
# print(str(num)[::-1])