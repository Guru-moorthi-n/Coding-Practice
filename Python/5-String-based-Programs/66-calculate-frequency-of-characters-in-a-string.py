text = input("Enter a String: ")
counter = {}

for ch in text:
    counter[ch] = counter.get(ch, 0) +1

print("The Character frequency is:")

for ch,count in counter.items():
    print(ch, "=", count)