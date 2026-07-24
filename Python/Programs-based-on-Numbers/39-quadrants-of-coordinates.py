num1 = int(input("Enter X coordinate value: "))
num2 = int(input("Enter Y coordinate value: "))

if (num1>0 and num2>0):
    print("First Quadrant.")
elif (num1<0 and num2>0):
    print("Second Quadrant.")
elif (num1<0 and num2<0):
    print("Third Quadrant.")
elif (num1>0 and num2<0):
    print("Fourth Quadrant.")
elif (num1==0 and num2==0):
    print("Origin Point.")
elif (num1==0):
    print("On Y-axis.")
elif (num2==0):
    print("On X-axis.")
else:
    print("Invalid Coordinates.")