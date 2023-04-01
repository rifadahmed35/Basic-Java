public class Loop_for_fibonacci_series_without_recursion {
    public static void main(String[] args) {
        int i, num1, num2, fibo, n;
        n=6;
        num1=0;
        num2=1;
        System.out.print(num1 + " " + num2);
        for(i=3; i<=n; i++){
            fibo= num1+num2;
            System.out.print(" " +fibo);
            num1 = num2;
            num2 = fibo;
        }
    }
}
