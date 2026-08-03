num = int(input("Enter a number: "))
fact = 1

if (num < 0):
    print("Invalid input")
else:
    for i in range(1, num+1):
        fact = fact * i
    
    print("Factorial of", num, "is:", fact)


# Using Recursion
# def  getFactorial(num):
#     if num == 1:
#         return 1
#     elif num < 0:
#         return "Invalid inputs."
#     else:
#         return num * getFactorial(num-1)

# print("Factorial:", getFactorial(num))