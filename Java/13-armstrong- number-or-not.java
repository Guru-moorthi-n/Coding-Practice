import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner getInput = new Scanner(System.in);
        
        int num = getInput.nextInt();
        int temp = num;
        int ans = 0;
        int length = String.valueOf(num).length();

        while (num > 0){
            int digit = num%10;
            ans += Math.pow(digit, length);
            num = Math.floorDiv(num, 10);
        }

        if (ans == temp) {
            System.out.println(temp + " is Armstrong number.");
        } else {
            System.out.println(temp +  " is Not Armstrong number.");
        }

        getInput.close();
    }
}