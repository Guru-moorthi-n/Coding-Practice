import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner getInput = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int num = getInput.nextInt();

        for (int i=1; i<=num; i++){
            for (int j=1; j<=num; j++){
                if (i==1 || i==num || j==1 || j==num){
                    System.out.print("* ");
                } else {
                    System.out.print("  ");
                }
            }
            System.out.println("");
        }
        getInput.close();
    }
}