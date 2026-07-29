text = input("Enter a String: ")

def Length(text, index):
    if index == len(text):
        return 0
    else: 
        return 1+Length(text, index+1)

print("\nLength is:", Length(text, 0))