ch = input("Enter a character: ").lower()

if ch.isalpha():
    if ch in "aeiou":
        print(ch, "is Vowel.")
    else:
        print(ch, "is Consonant.")
    
else:
    print(ch, "is Not an Alphabet.")