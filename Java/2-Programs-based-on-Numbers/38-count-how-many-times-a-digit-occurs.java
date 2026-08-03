import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner getInput = new Scanner(System.in);

        System.out.println("Enter a number:");
        String num = getInput.next();

        System.out.println("Enter search digit:");
        char search = getInput.next().charAt(0);

        int count = 0;

        for(int i=0; i<num.length(); i++) {
            char digit = num.charAt(i);
            if (digit == search) { 
                count+=1;
            }
        }
        System.out.println("Digit " + search + " occurs " + count + " times.");
        getInput.close();
    }
}