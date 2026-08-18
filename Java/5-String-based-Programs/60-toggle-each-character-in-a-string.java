import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner getInput = new Scanner(System.in);
        
        System.out.println("Enter a String: ");
        String text = getInput.nextLine();

        String result = "";
        for (char ch : text.toCharArray()){
            if (Character.isLowerCase(ch)){
                result += Character.toUpperCase(ch);
            }
            else if (Character.isUpperCase(ch)){
                result += Character.toLowerCase(ch);
            }
            else{
                result += ch;
            }
        }

        System.out.println("The Toggled string is: " + result);
        getInput.close();
    }
}