public class Do_while_digit_add {
    public static void main(String[] args){
        int num=4321, sum;
        for (sum=0; num!=0; num=num/10){
            sum=sum+(num%10);
        }
        {
            System.out.println(sum);
        }

    }
}
