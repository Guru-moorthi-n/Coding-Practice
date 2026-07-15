import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner getInput = new Scanner(System.in);

        System.out.println("Enter a number:");
        int num = getInput.nextInt();

        int n1 = 0;
        int n2 = 1;

        System.out.print("\nFibonacci Series: " + n1 + " " + n2);

        for (int i = 2; i<num; i++) {
            int n3 = n1 + n2;
            n1 = n2;
            n2 = n3;

            System.out.print(" " + n3);
        }
        getInput.close();
    }
}