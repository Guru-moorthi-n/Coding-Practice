import java.util.Scanner;

class Main{
    public static void main(String[] args) {
        Scanner getInput = new Scanner(System.in);

        System.out.println("Enter a number: ");
        int num = getInput.nextInt();
        int reverse = 0;

        while (num > 0) {
            int remainder = num%10;
            reverse = (reverse * 10) + remainder;
            num /= 10;
        }
        System.out.println("Reverse number is: " + reverse);
        getInput.close();
    }
}