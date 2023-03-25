public class Pattern_type_1 {
    public static void main(String[] args) {
        int row, col, N;
        N=3;
        for(row=1; row<=N; row++){
            for(col=1; col<=row; col++){
                System.out.print(" " +col);
            }
            System.out.println();
        }
    }
}
