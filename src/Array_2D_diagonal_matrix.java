public class Array_2D_diagonal_matrix {
    public static void main(String[] args){
        int A[][] = {{1, 2, 3},
                     {4, 5, 6},
                     {7, 8, 9}}; // 3*3 matrix

        int sumOfDiagonalElements = 0;
        int sumOfUpperTriangleElements =0;
        int sumOfLowerTriangleElements =0;

        //Now we will add the sum of diagonal, upper and lower triangle of this diagonal.

        for(int row=0; row<3; row++){
            for(int col=0; col<3; col++){
                if(row==col){
                    sumOfDiagonalElements = sumOfDiagonalElements + A[row][col];
                }
                if(row<col){
                    sumOfUpperTriangleElements = sumOfUpperTriangleElements + A[row][col];
                }
                if(row>col){
                    sumOfLowerTriangleElements = sumOfLowerTriangleElements + A[row] [col];
                }
            }
        }
        System.out.println("sum Of Diagonal Elements is: " +sumOfDiagonalElements);
        System.out.println("sum Of Upper Triangle Elements is: " +sumOfUpperTriangleElements);
        System.out.println("sum Of Lower Triangle Elements is : " +sumOfLowerTriangleElements);
    }
}
