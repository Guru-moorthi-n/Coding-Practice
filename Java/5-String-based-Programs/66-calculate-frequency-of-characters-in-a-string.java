import java.util.*;

class Main {
    public static void main(String[] args) {
        Scanner getInput = new Scanner(System.in);

        System.out.print("Enter a string: ");
        String text = getInput.nextLine();

        HashMap<Character, Integer> counter = new HashMap<>();

        for (char ch: text.toCharArray()){
            counter.put(ch, counter.getOrDefault(ch, 0)+1);
        }

        System.out.println("\nThe Character frequency is:");
        for (Map.Entry<Character, Integer> entry: counter.entrySet()){
            System.out.println(entry.getKey() + " = " + entry.getValue());
        }

        getInput.close();
    }
}