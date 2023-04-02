public class For_loop_series_multiplication {
    public static void main(String[] args) {
        int i, N=1;
        for( i=1; i<=5; i++){
            System.out.print(i+ " * " );
            N = N * i;
        }
        {
            System.out.println("= " +N);
        }
    }
}
