public interface Pattern_type_4 {
    public static void main(String[] args) {
        int N, row, col;
        N=3;
        for(row=N; row>=1; row--){
            for(col=1; col<=row; col++){
                System.out.print(" " +row%2);
            }
            System.out.println();
        }
    }
}
