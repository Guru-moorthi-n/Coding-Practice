class Main {
    public static void main(String[] args) {
        int num1 = 2;
        int num2 = 100;

        for (int i = num1; i<=num2; i++) {
            boolean flag = true;

            for (int j=2; j<i; j++) {
                if (i%j == 0){
                    flag = false;
                    break;
                }
            }
            if (flag) {
                System.out.print(i + " ");
            }
        }
    }
}