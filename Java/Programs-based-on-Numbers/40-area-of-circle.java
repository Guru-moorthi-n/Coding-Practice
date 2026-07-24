import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner getInput = new Scanner(System.in);

        System.out.println("Enter Radius:");
        double radius = getInput.nextFloat();
        double area = 3.14159 * (radius*radius);

        System.out.println("Area of circle: " + area);
        getInput.close();
    }
}