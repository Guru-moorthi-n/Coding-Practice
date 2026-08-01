import java.util.Scanner;

class Main {
    static void Permutations(String text, String ans) {
        if(text.length() == 0){
            System.out.print(ans + " ");
            return;
        }

        for (int i=0; i<text.length(); i++) {
            char ch = text.charAt(i);
            String remaining = text.substring(0, i) + text.substring(i+1);
            Permutations(remaining, ans+ch);
        }
    }

    public static void main(String[] args) {
        Scanner getInput = new Scanner(System.in);

        System.out.println("Enter a String:");
        String text = getInput.next().toUpperCase();    

        Permutations(text, "");
        getInput.close();
    }
}