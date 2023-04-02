public class For_loop_digit_addition {
    public static void main(String[] args) {
        int sum, num=4321;
        for(sum=0; num !=0; num = num/10){
            sum= sum + num%10;
        }
        {
            System.out.println(sum);
        }
    }
}
