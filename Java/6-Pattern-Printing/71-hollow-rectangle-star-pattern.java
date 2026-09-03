import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner getInput = new Scanner(System.in);

        System.out.print("Enter first number: ");
        int num1 = getInput.nextInt();

        System.out.print("Enter second number: ");
        int num2 = getInput.nextInt();

        for(int i=0; i<num1; i++){
            for(int j=0; j<num2; j++){
                if (i==0 || i==num1-1 || j==0 || j==num2-1){
                    System.err.print("*");
                }
                else {
                    System.out.print(" ");
                }
            }
            System.out.println("");
        }
        getInput.close();
    }
}