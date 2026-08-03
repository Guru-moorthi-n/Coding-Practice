arr = [10,20,5,75,15]

def Largest(arr, large, index):
    if index == len(arr):
        return large
    
    if(arr[index] > large):
        large= arr[index]

    return Largest(arr, large, index+1)

print("Largest value is:", Largest(arr, arr[0], 0))