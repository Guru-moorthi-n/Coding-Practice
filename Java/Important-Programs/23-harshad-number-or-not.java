import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner getInput = new Scanner(System.in);

        System.out.println("Enter a number:");
        int num = getInput.nextInt();
        int temp = num;
        int sum = 0;

        while (num > 0) {
            sum += num % 10;
            num /= 10;
        }

        if (temp % sum == 0) {
            System.out.println(temp + " is Harshad Number.");
        } else {
            System.out.println(temp + " is Not Harshad Number.");
        }

        getInput.close();
    }
}