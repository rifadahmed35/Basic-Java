public class Array_2D_basic {
    public static void main(String[] args){
        int number [] [] = new int[2][3];
        number[0][0] = 10;
        number[0][1] = 12;
        number[0][2] = 14;
        number[1][0] = 16;
        number[1][1] = 18;
        number[1][2] = 20;

        for(int row =0; row<2; row++){
            for(int col=0; col<3; col++){
                System.out.print(" " + number[row][col]);
            }
            System.out.println();
        }
    }
}
