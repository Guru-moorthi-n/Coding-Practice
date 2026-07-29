import java.util.Scanner;

class Main {
    static int reverse = 0;

    static void Reverse(int num){
        if (num == 0){
            return;
        } else {
            int digit = num%10;
            reverse = reverse*10 + digit;
            Reverse(num/10);
        }
    }
    
    public static void main(String[] args) {
        Scanner getInput = new Scanner(System.in);

        System.out.println("Enter a number:");
        int num = getInput.nextInt();

        Reverse(num);
        System.out.println("Reversed value is: " + reverse);
        
        getInput.close();
    }
}