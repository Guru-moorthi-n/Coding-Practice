import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner getInput = new Scanner(System.in);

        System.out.println("Enter year:");
        int year = getInput.nextInt();

        if ((year%400 == 0) || ((year%4 == 0) && (year%100 != 0))) {
            System.out.println("\n" + year + " is Leap year.");
        } else {
            System.out.println("\n" + year + " is Not Leap year.");
        }

        getInput.close();
    }
}


// Using built-in method
/* import java.time.Year;
boolean ans = Year.of(year).isLeap();
System.out.println((ans)? "\nLeap year." : "\nNot Leap year."); */