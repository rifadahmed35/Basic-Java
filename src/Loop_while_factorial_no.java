public class Loop_while_factorial_no {
    public static void main(String[] args) {
        int i, fact =1;
        i=4;
        while(i>=1) {
            fact = fact * i;
            i--;
        }
            System.out.println(fact);
    }
}
