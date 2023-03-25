public class Pattern_type_9 {
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
        for(row=N-1; row>=1; row--){
            for(col=1; col<=row; col++){
                System.out.print((char) (alphabet+col) + " ");
            }
            System.out.println();
        }
        //A
        //A B
        //A B C
        //A B
        //A
    }
}
