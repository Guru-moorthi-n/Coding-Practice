import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner getInput = new Scanner(System.in);

        System.out.println("Enter a number:");
        String num = getInput.next();

        String[] words = {"Zero", "One", "Two", "Three", "Four", "Five", "Six", "Seven", "Eight", "Nine"};

        for (int i = 0; i<num.length(); i++) {
            int digit = num.charAt(i) - '0';
            System.out.print(words[digit] + " ");
        }
        getInput.close();
    }
}