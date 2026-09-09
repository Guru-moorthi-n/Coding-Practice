import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner getInput = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int num = getInput.nextInt();

        for (int i=0; i<num; i++){
            if (i==0) {
                System.out.println(" ".repeat(num-i-1) + "*");
            }
            else if (i==num-1) {
                System.out.println("*".repeat(2*num-1));
            }
            else {
                System.out.println((" ".repeat(num-i-1) + "*") + (" ".repeat(2*i-1) + "*"));
            }
            getInput.close();
        }
    }
}