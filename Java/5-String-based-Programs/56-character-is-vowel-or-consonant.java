import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner getInput = new Scanner(System.in);

        System.out.println("Enter a character:");
        char ch = getInput.next().charAt(0);

        if (Character.isLetter(ch)){
            ch = Character.toLowerCase(ch);
            System.out.println("aeiou".indexOf(ch) != -1 ? ch + " is Vowel" : ch +  " is Consonant");
        }
        else{
            System.out.println("Not a Alphabet.");
        }
        getInput.close();
    }
}