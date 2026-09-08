import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner getInput = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int num = getInput.nextInt();

        for (int i=0; i<num; i++) {
            System.out.println(" ".repeat(num-i-1) + "*".repeat(2*i+1));
        }
        getInput.close();
    }
}