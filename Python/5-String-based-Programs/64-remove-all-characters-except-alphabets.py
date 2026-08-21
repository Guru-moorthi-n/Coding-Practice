text = input("Enter a String: ")
ans = ""

for ch in text:
    if ch.isalpha():
        ans += ch

print("The result is:", ans)