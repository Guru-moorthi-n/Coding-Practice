num = input("Enter a number consists of Zero's: ")
ans = ""

for digit in num:
    if digit == '0':
        ans += '1'
    else:
        ans += digit

print("The answer is: ", ans)


# num = int(input("Enter a number (Consists of zero's): "))
# ans = ""

# while num > 0:
#     digit = num%10
#     if (digit == 0):
#         digit = 1
#         ans += str(digit)
#     else:
#         ans += str(digit)
    
#     num = num//10

# print("The answer is: ", ans[::-1])