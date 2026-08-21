text = input("Enter a String: ")
reversed = ""

for i in range(len(text)-1, -1, -1):
    reversed += text[i]

print("The reversed string is:", reversed)

# Slicing method:
# text[::-1]