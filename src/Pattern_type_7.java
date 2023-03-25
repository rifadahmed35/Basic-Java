public class Pattern_type_7 {
    public static void main(String[] args) {
        int N, row, col;
        N=3;
        for(row=1; row<=N; row++){
            for(col=1; col<=row; col++){
                System.out.print(" "+col);
            }
            System.out.println();
        }
        for(row=N-1; row>=1; row--){
            for(col=1; col<=row; col++){
                System.out.print(" "+col);
            }
            System.out.println();
        }
        //1
        //1 2
        //1 2 3
        //1 2
        //1
    }
}
