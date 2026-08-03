import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner getInput = new Scanner(System.in);

        System.out.println("Enter first number:");
        int num1 = getInput.nextInt();

        System.out.println("\nEnter second number:");
        int num2 = getInput.nextInt();

        while (num2!=0) {
            int temp = num2;
            num2 = num1 % num2;
            num1 = temp;
        }
        System.out.println("\nHCF is: " + num1);
        getInput.close();
    }
}