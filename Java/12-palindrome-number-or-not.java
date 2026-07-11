import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner getInput = new Scanner(System.in);

        System.out.println("Enter a number:");
        int num = getInput.nextInt();
        int temp = num;
        int reverse = 0;

        while (num > 0) {
            int remainder = num%10;
            reverse = (reverse * 10) + remainder;
            num = Math.floorDiv(num, 10);
        }
        
        if (reverse == temp) {
            System.out.println(reverse + " is Palindrome number.");
        } else {
            System.out.println(reverse + " is Not Palindrome number.");
        }

        getInput.close();
    }
}