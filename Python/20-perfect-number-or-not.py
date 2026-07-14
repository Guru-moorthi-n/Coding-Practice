num = int(input("Enter a number: "))
sum = 0

for i in range(1, num):
    if num%i == 0:
        sum += i

if sum == num:
    print(num, "is Perfect number.")
else:
    print(num, "is Not perfect number.")


# Using while loop

# i = 1
# while i < num:
#     if num%i == 0:
#         sum += i
#     i += 1

# if sum == num:
#     print(num, "is Perfect number.")
# else:
#     print(num, "is Not perfect number.")