public class Pattern_type_17 {
    public static void main(String[] args) {
        int N, row, col;
        N=4;
        for(row=1; row<=N; row++){
            for (col=1; col<=N-row; col++){
                System.out.print(" ");
            }
            for (col=1; col<=row; col++){
                System.out.print(" " +"*");
            }
            System.out.println();
        }
    }
}
