text = input("Enter a String: ")
ans = ""

for ch in text:
    if ch != ' ':
        ans += ch
    
print("The final result is:", ans)