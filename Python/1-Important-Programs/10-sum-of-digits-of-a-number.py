num = int(input("Enter a number: "))
sum = 0

while num!=0:
    digit = int(num%10)
    sum += digit
    num = num//10

print("Sum is:", sum)

# Using recursion
def findSum(num):
    if num == 0:
        return sum
    return int(num%10) + findSum(num//10)

print("Sum is:", findSum(num))