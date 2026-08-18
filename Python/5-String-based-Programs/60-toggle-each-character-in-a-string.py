text = input("Enter a String: ")
result = ""

for ch in text:
    if ch.isupper():
        result += ch.lower()
    elif ch.islower():
        result+= ch.upper()
    else:
        result += ch

print("The Toggled string is:", result)

# Built-in Method
# text.swapcase()