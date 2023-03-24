public class Pyramid_pattern_2 {
    public static void main(String[] args) {
        int N, row, col;
        N=5;
        for(row=1; row<=N; row++){
            for(col=1; col<=N-row; col++){
                System.out.print(" ");
            }
            for(col=1; col<=2*row-1; col++){
                System.out.print("*");
            }
            System.out.println();
        }
        for(row=N-1; row>=1; row--){
            for(col=1; col<=N-row; col++){
                System.out.print(" ");
            }
            for(col=1; col<=2*row-1; col++){
                System.out.print("*");
            }
            System.out.println();
        }
    }

}
