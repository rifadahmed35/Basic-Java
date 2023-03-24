public class X_shape_pattern {
    public static void main(String[] args) {
        int N, row, col;
        N=5;
        for(row=1; row<=N; row++){
            for(col=1; col<=N; col++){
                if(row==col || row+col==N+1)
                    System.out.print("*");
                else
                    System.out.print(" ");
            }
            System.out.println();
        }
    }
}
