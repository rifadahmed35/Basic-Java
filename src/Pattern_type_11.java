public class Pattern_type_11 {
    public static void main(String[] args) {
        int N, row, col;
        N=3;
        for(row=1; row<=N; row++){
            for (col=1; col<=N-row; col++){
                //Printing space
                System.out.print(" ");
            }
            for (col=1; col<=row; col++){
                //Printing number
                System.out.print(row);
            }
            System.out.println();
        }
        //  1
        // 22
        //333
    }
}
