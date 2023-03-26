public class Pattern_Floyd_triangle {
    public static void main(String[] args) {
        int N, row, col, count=0;
        N=4;
        for(row=1; row<=N; row++){
            for(col=1; col<=row; col++){
                System.out.print(" " + ++count);
            }
            System.out.println();
        }
    }
}
