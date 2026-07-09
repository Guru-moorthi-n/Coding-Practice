import java.util.Scanner;

class Main {
    public static void main(String[] args) { 
        Scanner getInput = new Scanner(System.in);
        
        System.out.println("Enter a number: ");
        int num = getInput.nextInt();
        
        if (num > 0) {
            System.out.println("\nPositive number.");
        } else if (num == 0) {
            System.out.println("\nZero.");
        } else {
            System.out.println("\nNegative number.");
        }

        getInput.close();
    }
}