import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner getInput = new Scanner(System.in);

        System.out.println("Enter a number consists of Zero's:");
        String num = getInput.next();

        String ans = "";

        for (int i=0; i<num.length(); i++) {
            char digit = num.charAt(i);
            if (digit == '0') {
                ans += '1';
            } else {
                ans += digit;
            }
        }
        System.out.println("The answer is: " + ans);
        getInput.close();
    }
}