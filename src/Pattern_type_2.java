public class Pattern_type_2 {
    public static void main(String[] args) {
        int N, row, col; //col means column
        N=3;
        for(row=N; row>=1; row--){
            for(col=1; col<=row; col++){
                System.out.print(" "+col);
            }
            System.out.println();
            //1 2 3
            //1 2
            //1
        }
    }
}
