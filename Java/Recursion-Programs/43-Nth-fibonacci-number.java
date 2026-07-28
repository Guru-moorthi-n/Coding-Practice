import java.util.Scanner;

class Main {
    static int Fibonacci(int num) {
        if (num == 0){
            return 0;
        } else if (num == 1) {
            return 1;
        } else {
            return Fibonacci(num-1) + Fibonacci(num-2);
        }
    }

    public static void main(String[] args) {
        Scanner getInput = new Scanner(System.in);

        System.out.println("Enter N:");
        int num = getInput.nextInt();

        System.out.println("\nNth Fibonacci number: " + Fibonacci(num));
        getInput.close();
    }
}