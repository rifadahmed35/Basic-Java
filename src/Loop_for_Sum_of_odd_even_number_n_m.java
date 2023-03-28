public class Loop_for_Sum_of_odd_even_number_n_m {
    public static void main(String[] args) {
        int i, sum=0;
        for(i=1; i<=10; i++){
            if (i%2==0){
                continue;
            }
            sum = sum + i; }
        {
            System.out.println(sum);
        }
    }
}
