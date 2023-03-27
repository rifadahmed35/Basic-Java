public class Loop_do_while_reverse_number {
    public static void main(String[] args) {
        int num=4321, reverese=0;
        do{
            reverese = reverese*10 + num%10;
            num =num/10;
        } while(num!=0);
        System.out.println(reverese);
    }
}
