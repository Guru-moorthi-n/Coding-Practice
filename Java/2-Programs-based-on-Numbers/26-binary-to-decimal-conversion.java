import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner getInput = new Scanner(System.in);

        System.out.println("Enter Binary number:");
        String binary = getInput.next();

        int decimal = 0;
        int power = 0;

        for (int i = binary.length()-1; i >= 0; i--) {
            int digit = binary.charAt(i) - '0';
            decimal += digit * Math.pow(2, power);
            power++;
        }
        System.out.println("Decimal value is: " + decimal);
        getInput.close();
    }
}

// Using built-in method
// int decimal = Integer.parseInt(binary, 2);