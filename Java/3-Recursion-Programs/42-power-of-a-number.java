import java.util.Scanner;

class Main {
    static int Power(int base, int exponent) {
        if (exponent == 0) {
            return 1;
        } else {
            return base*Power(base, exponent-1);
        }
    }

    public static void main(String[] args) {
        Scanner getInput = new Scanner(System.in);

        System.out.println("Enter base value:");
        int base = getInput.nextInt();

        System.out.println("Enter exponent value:");
        int exponent = getInput.nextInt();

        System.out.println("\nThe answer is: " + Power(base, exponent));
        getInput.close();
    }
}