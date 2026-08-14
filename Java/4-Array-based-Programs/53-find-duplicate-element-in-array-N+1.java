class Main {
    static int Duplicate(int[] arr){
        int Single = arr[0];
        int Double = arr[0];

        while (true){
            Single=arr[Single];
            Double=arr[arr[Double]];

            if (Single == Double){
                break;
            }
        }

        Single = arr[0];
        while (Single != Double){
            Single = arr[Single];
            Double = arr[Double];
        }

        return Single;
    }
    
    public static void main(String[] args) {
        int[] arr = {2, 1, 5, 3, 4, 3};
        System.out.println("The Duplicate value is: " + Duplicate(arr));
    }
}