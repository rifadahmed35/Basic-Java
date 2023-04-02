public class Do_while_digit_addition {
    public static void main(String[] args) {
        int num=5321, sum=0;
        do{
            sum= sum + num%10;
            num = num/10;
        }while(num!=0);
        System.out.println(sum);
    }
}
