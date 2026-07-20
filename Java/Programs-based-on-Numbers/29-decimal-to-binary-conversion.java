import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner getInput = new Scanner(System.in);

        System.out.println("Enter decimal number:");
        int decimal = getInput.nextInt();

        String binary = "";

        while (decimal > 0) {
            int remainder = decimal%2;
            binary = remainder + binary;
            decimal /= 2;
        }
        
        System.out.println("Binary value is: " + binary);
        getInput.close();
    }
}

// Using built-in method
// String binary = Integer.toBinaryString(decimal);