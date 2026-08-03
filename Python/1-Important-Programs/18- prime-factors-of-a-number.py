num = int(input("Enter a number: "))
i = 2

print("\nPrime Factors: ")

while i<= num:
    if num%i == 0:
        print(i, end=" ")
        num = num//i
    else:
        i+=1
