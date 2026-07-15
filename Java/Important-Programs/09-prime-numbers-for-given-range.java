import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner getInput = new Scanner(System.in);

        System.out.println("Enter start number:");
        int num1 = getInput.nextInt();

        System.out.println("Enter end number:");
        int num2 = getInput.nextInt();

        System.out.println("\n");

        for (int i = num1; i < num2; i++) {
            boolean flag = false;
            if (i < 2) {
                continue;
            } else if (i == 2) {
                System.out.println(2);
                continue;
            } else {
                for (int j = 2; j < i; j++) {
                    if (i % j == 0) {
                        flag = true;
                        break;
                    }
                }
            }
            if (flag == false) {
                System.out.println(i);
            }
        }
        getInput.close();
    }
}