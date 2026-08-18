import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner getInput = new Scanner(System.in);
        
        System.out.println("Enter a String:");
        String userInput = getInput.nextLine();

        int length = 0;
        for (char ch : userInput.toCharArray()){
            length++;
        }
        System.out.println("\nThe Length of the String is: " + length);
        getInput.close();
    }
}