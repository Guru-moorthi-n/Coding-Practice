arr = [10, 5, 35, 21, 18]
large = arr[0]

for i in range(len(arr)):
    if arr[i]>large:
        large = arr[i]
    
print("Largest element is:", large)


# Using built-in method
# print(max(arr))