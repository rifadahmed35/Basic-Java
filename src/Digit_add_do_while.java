public class Digit_add_do_while {
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
