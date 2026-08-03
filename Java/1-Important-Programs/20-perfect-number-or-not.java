import java.util.Scanner;

class Main{
    public static void main(String[] args) {
        Scanner getInput = new Scanner(System.in);

        System.out.println("Enter a number:");
        int num = getInput.nextInt();
        int sum = 0;

        for (int i=1; i<num; i++){
            if (num%i == 0){
                sum += i;
            }
        }

        System.out.println((sum == num) ? (num + " is Perfect number.") : (num + " is Not perfect number."));
        getInput.close();
    }
}

// Using while loop
/* int i = 1;
        while (i<num) {
            if (num%i == 0){
                sum += i;
            }
            i++;
        } */