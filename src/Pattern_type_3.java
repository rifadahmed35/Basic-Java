public class Pattern_type_3 {
    public static void main(String[] args) {
        int row, col;
        int N=3;
        for(row=1; row<=N; row++){
            for(col=1 ; col<=row; col++ ){
                System.out.print(" " + row);
            }
            System.out.println();
        }
    }
}
