arr = [10, 15, 0, 78, -3]

def Smallest(arr, small, index):
    if index == len(arr):
        return small
    
    if arr[index] < small:
        small = arr[index]

    return Smallest(arr, small, index+1)

print("Smallest value is:", Smallest(arr, arr[0], 0))