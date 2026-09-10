num = int(input("Enter a number: "))

for i in range(num):
    print((" "*i) + ("*" * (2*(num-i)-1)))