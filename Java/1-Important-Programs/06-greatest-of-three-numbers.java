import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner getInput = new Scanner(System.in);

        System.out.println("Enter three numbers:");
        int num1 = getInput.nextInt();
        int num2 = getInput.nextInt();
        int num3 = getInput.nextInt();

        if ((num1 > num2) && (num1 > num3)) {
            System.out.println("\nGreatest number is: " + num1);
        }
        else if ((num2 > num1) && (num2 > num3)) {
            System.out.println("\nGreatest number is: " + num2);
        }
        else if ((num3 > num1) && (num3 > num2)){
            System.out.println("\nGreatest number is: " + num3);
        }
        else {
            System.out.println("\nInvalid Inputs.");
        }

        getInput.close();
    }
}