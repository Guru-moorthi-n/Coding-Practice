import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner getInput = new Scanner (System.in);

        System.out.println("Enter a  number:");
        int num = getInput.nextInt();
        int flag = 0;

        for (int i=2; i<num; i++){
            if (num%i == 0) {
                flag = 1;
                break;
            }
        }

        if (flag == 1) {
            System.out.println(num + " is Not Prime number.");
        } else {
            System.out.println(num + " is Prime number.");
        }

        getInput.close();
    }
}