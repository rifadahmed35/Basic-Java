public class For_loop_summation_of_number {
    public static void main(String[] args) {
        int i, sum=0;
        for(i=30 ; i<=120; i++) {
            if (i % 3 == 0 && i % 5 == 0) {
                sum = sum + i;
            }
        }
        {
            System.out.println(sum);

        }
    }
}
