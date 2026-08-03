import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner getInput = new Scanner(System.in);

        System.out.println("Enter a number:");
        int num = getInput.nextInt();
        int sum = 0;

        while (num != 0) {
            int digit = num%10;
            sum += digit;
            num /= 10;
        }

        System.out.println("Sum is: " + sum);
        getInput.close();
    }
}