num = int(input("Enter a number: "))

for i in range(num):
    for j in range(num):
        print("*", end=" ")
    print()


# Short-cut method
# num = 4

# for i in range(num):
#     print("* " * num)