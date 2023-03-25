public class Pattern_type_5 {
    public static void main(String[] args) {
        int N, row, col;
        int alphabet = 64;
        N=3;
        for(row=1; row<=N; row++){
            for(col=1; col<=row; col++){
                System.out.print((char) (alphabet+col) + " ");
            }
            System.out.println();
        }
    }
}
