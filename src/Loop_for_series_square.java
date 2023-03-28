public class Loop_for_series_square {
    public static void main(String[] args) {
        int i, sum=0;
        for( i=1; i<=5; i++){
            System.out.print(i+ "*" +i + " + ");
            sum= sum + (i*i);
        }
        {
            System.out.println();
            System.out.println("= " + sum);
        }
    }
}
