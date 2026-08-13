class Main {
    public static void main(String[] args) {
        int[] arr = { 8, -10, -5, 14, 6, -2, 9 };
        int j = 0;

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] < 0) {
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;

                j++;
            }
        }
        System.out.println("Final Result is: ");
        for (int num : arr) {
            System.out.print(num + " ");
        }
    }
}