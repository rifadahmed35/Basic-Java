public class Loop_for_series {
    public static void main(String[] args) {
        double i, sum = 0;
        for (i=1.5; i <= 11.5; i++) {
            System.out.print(i+ " + ");
            sum = sum + i;
        }
        {
            System.out.println(" = " + sum);
        }
    }
}
