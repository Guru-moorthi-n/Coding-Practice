import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner getInput = new Scanner(System.in);

        System.out.println("Enter a number:");
        int num = getInput.nextInt();
        int i = 1;

        while (i<=num) {
            if (num%i == 0){
                System.out.print(i + " ");
            }
            i++;
        }

        getInput.close();
    }
}