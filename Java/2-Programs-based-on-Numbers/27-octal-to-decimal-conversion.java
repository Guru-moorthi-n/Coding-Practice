import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner getInput = new Scanner(System.in);

        System.out.println("Enter Octal number:");
        String octal = getInput.next();

        int decimal = 0;
        int power = 0;

        for (int i = octal.length()-1; i>=0; i--) {
            int digit = octal.charAt(i)-'0';
            decimal += digit * Math.pow(8, power);
            power++;
        }
        System.out.println("Decimal value is: " + decimal);
        getInput.close();
    }
}

// Using built-in method
// int decimal = Integer.parseInt(octal, 2);