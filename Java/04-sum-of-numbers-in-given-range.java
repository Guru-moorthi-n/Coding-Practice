import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner getInput = new Scanner(System.in);

        System.out.println("Enter start number:");
        int num1 = getInput.nextInt();

        System.out.println("Enter end number:");
        int num2 = getInput.nextInt();

        int sum = 0;

        for (int i=num1; i<=num2; i++) {
            sum += i;
        }

        System.out.println("\nSum of " + num1 + " to " + num2 + " is: " + sum);
        getInput.close();
    }
}