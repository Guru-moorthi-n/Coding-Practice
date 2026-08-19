text = input("Enter a String: ").lower()
count = 0

for ch in text:
    if ch.isalpha():
        if ch in "aeiou":
            count+=1

print("The number of vowels are:", count)