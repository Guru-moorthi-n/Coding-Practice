import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner getInput = new Scanner(System.in);

        System.out.println("Enter a number:");
        int num = getInput.nextInt();
        int root = (int) Math.sqrt(num);

        if (root * root == num) {
            System.out.println(num + " is Perfect Square.");
        } else {
            System.out.println(num + " is Not Perfect Square.");
        }
        getInput.close();
    }
}