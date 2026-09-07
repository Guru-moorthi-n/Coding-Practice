import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner getInput = new Scanner(System.in);

        System.out.print("Enter first number: ");
        int num1 = getInput.nextInt();

        System.out.print("Enter second number: ");
        int num2 = getInput.nextInt();

        for (int i=0; i<num1; i++) {
            System.out.println((" ".repeat(i)) + ("*".repeat(num2)));
        }
        getInput.close();
    }
}