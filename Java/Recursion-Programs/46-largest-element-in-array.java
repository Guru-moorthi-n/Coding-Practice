class Main {
    static int Largest(int[] arr, int larg, int index){
        if (index == arr.length)  {
            return larg;
        }
        if (arr[index] > larg){
            larg = arr[index];
        }
        return Largest(arr, larg, index+1);
    }

    public static void main(String[] args) {
        int[] arr = {10, 25, 5, 75, 15};

        System.out.println("Largest value is: " + Largest(arr, arr[0], 0));
    }
}