public class Pattern_type_8 {
    public static void main(String[] args) {
        int N, row, col;
        N= 3;
        for(row=1; row<=N; row++){
            for(col=1; col<=row; col++){
                System.out.print(" "+row);
            }
            System.out.println();
        }
        for(row=N-1; row>=1; row--){
            for(col=1; col<=row; col++){
                System.out.print(" "+row);
            }
            System.out.println();
        }
        //1
        //2 2
        //3 3 3
        //2 2
        //1
    }
}
