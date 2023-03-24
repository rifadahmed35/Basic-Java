public class Pattern_type_19 {
    public static void main(String[] args) {
        int N, row, col;
        N=4;
        for(row=1; row<=N; row++){
            for(col=1; col<=N-row; col++){
                System.out.print(" ");
            }
            for(col=1; col<=row; col++){
                System.out.print(col);
            }
            for(col=row-1; col>=1; col--){
                System.out.print(col);
            }
            System.out.println();
        }
    }
}
