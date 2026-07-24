num = input("Enter a number: ")
search = input("Enter search digit: ")
count = 0

for digit in num:
    if digit==search:
        count+=1

print("\nDigit", search, "occurs", count, "times.")