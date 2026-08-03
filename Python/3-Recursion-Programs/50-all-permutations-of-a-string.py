String = input("Enter a String: ")
text = String.upper()

def Permutations(text, ans):
    if len(text) == 0:
        print(ans, end=" ")
        return
    
    for i in range(len(text)):
        ch = text[i]
        remaining = text[:i] + text[i+1:]
        Permutations(remaining, ans+ch)

Permutations(text, "")