arr = [20, 85, 97, 15, 60]
small = arr[0]

for i in range(len(arr)):
    if (arr[i]<small):
        small=arr[i]

print("Smallest element is:", small)


# Using built-in method:
# print(min(arr))