public class Loop_for_reverse_digit {
    public static void main(String[] args) {
        int i, reverse=0;
        for(i=4321; i>0; i=i/10) {
            reverse = reverse * 10 + i % 10;
        }
        {
            System.out.print(reverse);
        }
    }
}
