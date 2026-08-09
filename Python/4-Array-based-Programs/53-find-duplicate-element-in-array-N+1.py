def Duplicate(arr):
    single= arr[0]
    double = arr[0]

    while True:
        single= arr[single]
        double=arr[arr[double]]

        if single == double:
            break
    
    single = arr[0]

    while single != double:
        single = arr[single]
        double = arr[double]

    return single 


arr = [1, 5, 3, 2, 5, 4]
print("The Duplicate element is:", Duplicate(arr))