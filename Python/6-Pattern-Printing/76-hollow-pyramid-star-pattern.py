num = int(input("Enter a number: "))

for i in range(num):
    if i==0:
        print(" " * (num-i-1) + "*")
    elif i==num-1:
        print("*" * (2*num-1))
    else:
        print(" " * (num-i-1) + "*" + " " * (2*i-1) + "*")