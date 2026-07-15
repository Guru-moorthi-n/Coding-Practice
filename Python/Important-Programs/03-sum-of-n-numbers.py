# Sum of first N natural Numbers.

num = int(input("Enter a number: "))
sum = 0
 
for i in range(num+1):
    sum+=i

print("Sum is:",  sum)


# Using Formula sum=(num*(num+1)/2)
sum_answer=int(num*(num+1)/2)
print(sum_answer)