public class Pattern_type_16 {
    public static void main(String[] args) {
        int N, row, col;
        N=4;
        for(row=1; row<=N; row++){
            for (col=1; col<=row; col++){
                System.out.print(row*col + " ");
            }
            System.out.println();
        }
    }
}
