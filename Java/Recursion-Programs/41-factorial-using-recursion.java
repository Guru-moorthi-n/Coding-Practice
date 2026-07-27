import java.util.Scanner;

class Main {
    static int Factorial(int num){
        if (num == 1){
            return 1;
        } else {
            return num * Factorial(num-1);
        }
    }

    public static void main(String[] args) {
        Scanner getInput = new Scanner(System.in);

        System.out.println("Enter a numebr:");
        int num = getInput.nextInt();

        System.out.println("\nFactorial: " + Factorial(num));
        getInput.close();
    }
}