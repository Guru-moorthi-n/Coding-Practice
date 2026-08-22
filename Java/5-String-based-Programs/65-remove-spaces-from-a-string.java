import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner getInput = new Scanner(System.in);

        System.out.print("Enter a String: ");
        String text = getInput.nextLine();

        String ans = "";
        for (char ch:text.toCharArray()){
            if(ch != ' '){
                ans += ch;
            }
        }

        System.out.println("The fianl Result is: " + ans);
        getInput.close();
    }
}