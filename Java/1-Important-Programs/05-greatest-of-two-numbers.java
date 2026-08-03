import java.util.Scanner;

class Main {
    public static void main (String[] args) {
        Scanner getInput = new Scanner(System.in);

        System.out.println("Enter first number:");
        int num1 = getInput.nextInt();

        System.out.println("Enter second number:");
        int num2 = getInput.nextInt();

        if (num1 == num2) {
            System.out.println("\nBoth are equal.");
        } else if (num1 > num2) {
            System.out.println("\nGreatest number is: " + num1);
        } 
        else {
            System.out.println("\nGreatest number is: " + num2);
        }

        getInput.close();
    }
}

// Using built-in method
// System.out.println(Math.max(num1, num2));

// Using ternary operator
// System.out.println((num1 > num2) ? num1 : num2);