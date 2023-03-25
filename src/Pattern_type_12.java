public class Pattern_type_12 {
    public static void main(String[] args) {
        int N, row, col;
        int alphabet = 96;
        N=3;
        for(row=1; row<=N; row++){
            for (col=1; col<=N-row; col++){
                //Printing space
                System.out.print(" ");
            }
            for (col=1; col<=row; col++){
                //Printing number
                System.out.print((char) (alphabet+row));
            }
            System.out.println();
        }
        //  a
        // bb
        //ccc
    }
}
