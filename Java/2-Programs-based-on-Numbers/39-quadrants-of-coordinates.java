import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner getInput = new Scanner(System.in);

        System.out.println("Enter X coordinate value:");
        int num1 = getInput.nextInt();

        System.out.println("Enter Y coordinate value:");
        int num2 = getInput.nextInt();

        if (num1>0 && num2>0) {
            System.out.println("First Quadrant.");
        } else if (num1<0 && num2>0) {
            System.out.println("Second Quadrant.");
        } else if (num1<0 && num2<0) {
            System.out.println("Third Quadrant.");
        } else if (num1>0 && num2<0) {
            System.out.println("Fourth Quadrant.");
        } else if (num1==0) {
            System.out.println("On Y-axis.");
        } else if (num2==0) {
            System.out.println("On X-axis.");
        } else {
            System.out.println("Invalid Coordinates.");
        }
        getInput.close();
    } 
}