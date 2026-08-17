import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner getInput = new Scanner(System.in);

        System.out.println("Enter a Character:");
        char ch = getInput.next().charAt(0);

        int ascii = (int) ch;
        System.out.println("ASCII value is: " + ascii);

        getInput.close();
    }
}