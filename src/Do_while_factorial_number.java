public class Do_while_factorial_number {
    public static void main(String[] args) {
        int i=3, fact=1;
        do {
            fact = fact * i;
            i--;
        }while(i>=1);
        System.out.println(fact);
    }
}
