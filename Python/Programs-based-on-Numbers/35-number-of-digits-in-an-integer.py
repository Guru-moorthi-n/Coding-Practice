num = int(input("Enter a number: "))
count = 0

if num == 0:
    print("\nNumber of digits: 1")
else:
    while num > 0:
        count += 1
        num = num//10

    print("\nNumber of digits:",count)


# Using built-in len() method
# num = input("Enter a number: ")
# print("Number of digits:", len(num))