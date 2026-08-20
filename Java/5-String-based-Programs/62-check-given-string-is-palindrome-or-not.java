import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner getInput = new Scanner(System.in);

        System.out.println("Enter a String: ");
        String text = getInput.nextLine().toLowerCase();

        String reverse = new StringBuilder(text).reverse().toString();
        if (text.equals(reverse)) {
            System.out.println(text + " is Palindrome.");
        } else {
            System.out.println(text + " is Not Palindrome.");
        }
        getInput.close();
    }
}