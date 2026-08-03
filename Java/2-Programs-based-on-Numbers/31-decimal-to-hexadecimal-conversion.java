import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner getInput = new Scanner(System.in);

        System.out.println("Enter Decimal number:");
        int decimal = getInput.nextInt();

        String hexadigits = "0123456789ABCDEF";
        String hexa = "";

        if (decimal == 0) {
            System.out.println("Hexadecimal value is: 0");
        } else {
            while (decimal > 0) {
                hexa = hexadigits.charAt(decimal%16) + hexa;
                decimal /= 16;
            }
            System.out.println("Hexadecimal value is: " + hexa);
        }
        
        getInput.close();
    }
}

// Using built-in method:
// String hexa = Integer.toHexString(decimal).toUpperCase();
// System.out.println("Hexadecimal value is: " + hexa);