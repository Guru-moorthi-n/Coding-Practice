import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner getInput = new Scanner(System.in);

        System.out.println("Enter a String: ");
        String text = getInput.nextLine();
        int count = 0;

        for (char ch:text.toCharArray()){
            if ("aeiou".indexOf(ch)!= -1){
                count += 1;
            }
        }
        System.out.println("The number of Vowels are: " + count);
        getInput.close();
    }
}