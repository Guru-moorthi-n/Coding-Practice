import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner getInput = new Scanner(System.in);

        System.out.println("Enter base number:");
        int num = getInput.nextInt();
        
        System.out.println("Enter power number:");
        int power = getInput.nextInt();

        int ans = 1;

        for (int i = 1; i <= power; i++) {
            ans *= num;
        }

        System.out.println("The " + num + "^" + power + " is " + ans);
        getInput.close();
    }
}

// // Using built-in method
// System.out.println(Math.pow(num, power));