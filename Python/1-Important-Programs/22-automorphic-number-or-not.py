num = int(input("Enter a number: "))
square = pow(num, 2)
mod = pow(10, len(str(num)))

if (square%mod == num):
    print(num, "is Automorphic Number.")
else:
    print(num, "is Not Automorphic Number.")


# Using enswith() method
# a = str(num)
# b = str(square)

# if b.endswith(a):
#     print("Automorphic number")
# else:
#     print("Not Automorphic number")