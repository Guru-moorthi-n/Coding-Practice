class Main {
    public static void main(String[] args) {
        int[] arr = {55, 13, 84, 26, 10};
        int small = arr[0];

        for(int i=1; i<arr.length; i++){
            if(arr[i]<small){
                small = arr[i];
            }
        }
        System.out.println("Smallest element is: " + small);
    }
}

// Using built-in method:
// import java.util.Arrays;
// int small = Arrays.stream(arr).min().getAsInt();