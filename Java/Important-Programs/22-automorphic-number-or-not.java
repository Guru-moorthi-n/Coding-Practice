import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner getInput = new Scanner(System.in);

        System.out.println("Enter a number:");
        int num = getInput.nextInt();
        
        int square = num*num;
        int length = String.valueOf(num).length();
        int mod =  (int) Math.pow(10, length);

        if (square%mod == num){
            System.out.println(num + " is Automorphic number.");
        } else {
            System.out.println(num + " is Not Automorphic number.");
        }

        getInput.close();
    }
}