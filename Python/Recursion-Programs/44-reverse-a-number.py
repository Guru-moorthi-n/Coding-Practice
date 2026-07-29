num = int(input("Enter a number: "))
reverse = 0

def Reverse(num):
    global reverse

    if num == 0:
        return
    else:
        digit = num%10
        reverse = reverse*10 + digit
        Reverse(num//10)

Reverse(num)
print("\nReversed number is:", reverse)