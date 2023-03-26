public class Loop_for_factorial_number {
    public static void main(String[] args) {
        int i, num, fact=1;
        num=4;
        for (i=1; i<=num; i++){
            fact = fact*i;
        }
        System.out.println(fact);
    }
}
