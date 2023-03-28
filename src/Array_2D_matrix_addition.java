public class Array_2D_matrix_addition {
    public static void main(String[] args) {
        int A[][]= {{3, 4, 5},
                    {4, 3, 2}}; //[2*3] dimensional array
        int B[][]= {{2, 4, 4},
                    {2, 3, 4}};
        int C[][] = new int[2][3];


        //Adding the two matrix.
        System.out.println("A+B = ");
        for(int row=0; row<2; row++) { //for row
            for (int col = 0; col < 3; col++) { //for column
                C[row][col] = A[row][col] + B[row][col];
                System.out.print(" " + C[row][col]);
            }
            System.out.println();
        }
    }
}
