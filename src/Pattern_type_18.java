public class Pattern_type_18 {
    public static void main(String[] args) {
        int N, row, col;
        N = 4;
        for (row = 1; row <= N; row++) {
            for (col = N; col >= N - row; col--) {
                System.out.print(" ");
            }
            for (col = N; col >= row; col--) {
                System.out.print(" " + "*");
            }
            System.out.println();
        }
    }
}
