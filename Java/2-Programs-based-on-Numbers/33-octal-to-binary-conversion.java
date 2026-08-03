import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner getInput = new Scanner(System.in);

        System.out.println("Enter Octal value:");
        String octal = getInput.next();

        int decimal = Integer.parseInt(octal, 8);
        String binary = Integer.toBinaryString(decimal);

        System.out.println("\nBinary value is: " + binary);
        getInput.close();
    }

}