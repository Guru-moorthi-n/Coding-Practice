import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner getInput = new Scanner(System.in);

        System.out.println("Enter decimal number:");
        int decimal = getInput.nextInt();

        String octal = "";

        while (decimal > 0) {
            int remainder = decimal%8;
            octal = remainder + octal;
            decimal /= 8;
        }
        
        System.out.println("Octal value is: " + octal);
        getInput.close();
    }
}

// Using built-in method
// String octal = Integer.toOctalString(decimal);