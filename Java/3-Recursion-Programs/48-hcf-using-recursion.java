import java.util.Scanner;

class Main {
    static int HCF(int num1, int num2){
        if (num2 == 0) {
            return num1;
        }
        return HCF(num2, num1%num2);
    }

    public static void main(String[] args) {
        Scanner getInput = new Scanner(System.in);

        System.out.println("Enter first number:");
        int num1 = getInput.nextInt();

        System.out.println("Enter second number:");
        int num2 = getInput.nextInt();

        System.out.println("\nHCF is: " + HCF(num1, num2));
        getInput.close();
    }
}