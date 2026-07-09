num = int(input("Enter a number: "))
 
if num > 0:
    print(num, "is Positive.")
elif num < 0:
    print(num, "is Negative.")
else:
    print("Zero.")


# In single line
print("Postive") if (num>0) else print("Negative.")