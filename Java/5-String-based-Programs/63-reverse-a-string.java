import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner getInput = new Scanner(System.in);

        System.out.print("Enter a String: ");
        String text = getInput.nextLine();

        String reversed = "";
        for (int i=text.length()-1; i>=0; i--){
            reversed += text.charAt(i);
        }

        System.out.println("The reversed String is: " + reversed);
        getInput.close();
    }
}

// Built-in method
// String reverse = new StringBuilder(text).reverse().toString();