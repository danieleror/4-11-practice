public class sum_even_fibonacci {
    //main function
    public static void main(String[] args) {
        //initialize values
        int a = 0, b = 1;
        int sumEven = 0;
        // continue while loop until b>= 4000000
        while (b < 4000000) {
            //if statement while b is even
            if (b % 2 == 0) {
                //add the even sum with even b
                sumEven += b;
            }
            //initialize
            int temp = b;
            //add values
            b = a + b;
            a = temp;
        }
        System.out.println(sumEven);
    }
}

// answer should be 4613732
