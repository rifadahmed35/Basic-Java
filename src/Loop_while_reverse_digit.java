public class Loop_while_reverse_digit {
    public static void main(String[] args) {
        int num=4321, reverse=0;
        while(num!=0){
            reverse= reverse*10 + num%10;
            num=num/10;
        }
        {
            System.out.println(reverse);
        }
    }
}
