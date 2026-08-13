arr = [-2, 1, 10, -6, -8, 5, -11]
j=0

for i in range(len(arr)):
    if arr[i] < 0:
        arr[i], arr[j] = arr[j], arr[i]
        j+=1
    
print("\nFinal Result: ", arr)