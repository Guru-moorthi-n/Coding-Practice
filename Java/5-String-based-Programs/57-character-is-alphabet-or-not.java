import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner getInput = new Scanner(System.in);

        System.out.println("Enter a Character:");
        char ch = getInput.next().charAt(0);
        char ans = Character.toLowerCase(ch);
        
        if (Character.isLetter(ans)){
            System.out.println(ch + " is an Alphabet.");
        } else {
            System.out.println(ch + " is Not an Alphabet");
        }
        getInput.close();
    }
}