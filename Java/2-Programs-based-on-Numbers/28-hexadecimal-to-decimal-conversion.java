import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner getInput = new Scanner(System.in);

        System.out.println("Enter Hexadecimal number:");
        String hexa = getInput.next().toUpperCase();

        int decimal = 0;
        int power = 0;

        for (int i = hexa.length()-1; i>=0; i--) {
            char ch = hexa.charAt(i);
            int value;

            if (ch >= '0' && ch <= '9') {
                value = ch - '0';
            } else {
                value = ch - 'A'+10;
            }
            decimal += value * (int)Math.pow(16, power);
            power++;
        }
        System.out.println("Decimal value is: " + decimal);
        getInput.close();
    }
}