import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner getInput = new Scanner(System.in);

        System.out.println("Enter a number:");
        int num = getInput.nextInt();
        int temp = num;
        int ans = 0;

        while (num > 0) {
            int digit = num % 10;
            int fact = 1;

            for (int i = 1; i <= digit; i++) {
                fact = fact * i;
            }

            ans += fact;
            num /= 10;
        }

        System.out.println((ans == temp) ? (temp + " is Strong number.") : (temp + " is Not Strong number."));
        getInput.close();
    }
}