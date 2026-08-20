text = input("Enter a sting: ").lower()

if text == text[::-1]:
    print(text, "is Palindrome.")
else:
    print(text, "is Not Palindrome.")