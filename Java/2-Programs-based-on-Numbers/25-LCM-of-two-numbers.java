import java.util.Scanner;

class Main{
    public static void main(String[] args) {
        Scanner getInput = new Scanner(System.in);

        System.out.println("Enter first number:");
        int num1 = getInput.nextInt();

        System.out.println("Enter second number:");
        int num2 = getInput.nextInt();

        int lcm = Math.max(num1, num2);

        while (true) {
            if ((lcm%num1 == 0) && (lcm%num2 == 0)) {
                break;
            } else {
                lcm += 1;
            }
        }
        System.out.println("LCM is: " + lcm);
        getInput.close();
    }
}