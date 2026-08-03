import java.util.Scanner;

class Main {
    static int Length(String text, int index){
        if (index == text.length()){
            return 0;
        } else {
            return 1+Length(text, index+1);
        }
    }

    public static void main(String[] args) {
        Scanner getInput = new Scanner(System.in);

        System.out.println("Enter a String:");
        String text = getInput.next();

        System.out.println("Length is: " + Length(text, 0));
        getInput.close();
    }
}