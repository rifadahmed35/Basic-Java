public class Pyramid_pattern_1 {
    public static void main(String[] args) {
        int N, row, col;
        N = 3;
        for (row = 1; row <= N; row++) {
            for (col = 1; col <= N - row; col++) {
                System.out.print(" ");
            }
            for (col = 1; col <= 2*row -1; col++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
