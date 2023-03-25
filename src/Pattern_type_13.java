public class Pattern_type_13 {
    public static void main(String[] args) {
        int N, row, col;
        N=5;
        for(row=N; row>=1; row--){
            for(col=1; col<=N-row; col++){
                System.out.print(" ");
            }
            for(col=1; col<=row; col++){
                System.out.print(col);
            }
            System.out.println();
        }
    }
}
