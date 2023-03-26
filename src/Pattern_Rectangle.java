public class Pattern_Rectangle {
    public static void main(String[] args) {
        int N, row, col;
        N=4;
        for(row=1; row<=N; row++){
            for(col=1; col<=N; col++){
                if(row==1 || row==N || col==1 || col==N)
                    System.out.print("*");
                else
                    System.out.print(" ");
            }
            System.out.println();
        }
    }
}
