class Main {
    public static void main(String[] args) {
        int[] arr = {25, 89, 47, 75, 14};
        int large = arr[0];

        for(int i=1; i<arr.length; i++) {
            if (arr[i] > large) {
                large = arr[i];
            }
        }
        
        System.out.println("Largest element is: " + large);
    }
}


// Using built-in Method:
// import java.util.Arrays;
// int large = Arrays.stream(arr).max().getAsInt();