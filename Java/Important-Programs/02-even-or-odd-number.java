import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner getInput = new Scanner(System.in);
        
        System.out.println("Enter a number: ");
        int num = getInput.nextInt(); 
        
        if (num%2 == 0) {
            System.out.println("\nEven Number.");
        } else {
            System.out.println("\nOdd number.");
        }

        getInput.close();
    }
}