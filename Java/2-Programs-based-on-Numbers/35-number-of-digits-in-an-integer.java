import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner getInput = new Scanner(System.in);

        System.out.println("Enter a number:");
        int num = getInput.nextInt();
        int count = 0;

        if (num == 0) {
            System.out.println("\nNumber of digits: 1");
        } else {
            while (num > 0) {
                num /= 10;
                count++;
            }
            System.out.println("\nNumber of digits: " + count);
        }
        getInput.close();
    }
}

// Using built-in method
// String num = "597564";
// int count = num.length();