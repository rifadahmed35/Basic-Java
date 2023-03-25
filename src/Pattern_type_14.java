public class Pattern_type_14 {
    public static void main(String[] args) {
        int N, row, col;
        N=5;
        for(row=1; row<=N; row++){
            for(col=1; col<=N-row; col++){
                System.out.print(" ");
            }
            for(col=1; col<=row; col++){
                System.out.print(col);
            }
            System.out.println();
        }
        for(row=N-1; row>=1; row--){
            for(col=1; col<=N-row; col++){
                System.out.print(" ");
            }
            for(col=1; col<=row; col++){
                System.out.print(col);
            }
            System.out.println();
        }
//    1
//   12
//  123
// 1234
//12345
// 1234
//  123
//   12
//    1
    }
}
