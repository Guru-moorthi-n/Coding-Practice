import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner getInput = new Scanner(System.in);

        System.out.println("Enter a number:");
        int num = getInput.nextInt();
        int sum = 0;

        for (int i=1; i<=num; i++) {
            sum += i;  
        }

        System.out.println("\nSum is: " + sum);
        getInput.close();
    }
}