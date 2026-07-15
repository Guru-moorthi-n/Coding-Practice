num1 = int(input("Enter a start number: "))
num2 = int(input("Enter a End number: "))
sum = 0

for i in range(num1, num2+1):
    sum+=i

print("Sum of", num1, "to", num2, "is:", sum)
 

# Using Recursion
def SumOfRange(sum, num1, num2):
    if num1 > num2:
        return sum
    
    return num1 + SumOfRange(sum, num1+1, num2)

sum=0
print(SumOfRange(sum, num1, num2))