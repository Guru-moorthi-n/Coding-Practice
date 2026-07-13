import java.util.Scanner;

class Main{
    public static void main(String[] args) {
        Scanner getInput = new Scanner(System.in);

        System.out.println("Enter a numebr: ");
        int num = getInput.nextInt();
        int fact = 1;

        if (num < 0){
            System.out.println("\nInvalid Input.");
        } else {
            for (int i = 1; i <= num; i++) {
                fact = fact * i;
            }
            System.out.println("\nFactorial of " + num + " is " + fact);
        }
        getInput.close();
    }
}

// Using Recursion
/*
 static int factorial(int n) {
    if (n == 0){
        return 1;
    } else {
        return n * factorail(n-1);
    }
 }

 public static void main(String[] args) {
    int num = 6;
    System.out.println("Factorial of " + num + " is " + factorial(num))
 }
*/