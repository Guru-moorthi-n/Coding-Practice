class Main {
    static int Smallest(int[] arr, int small, int index){
        if (index == arr.length){
            return small;
        }
        if (arr[index] < small){
            small = arr[index];
        }
        return Smallest(arr, small, index+1);
    }

    public static void main(String[] args) {
        int[] arr = {10, 5, 87, 1, 3};

        System.out.println("Smallest value is: " + Smallest(arr, arr[0], 0));
    }
}