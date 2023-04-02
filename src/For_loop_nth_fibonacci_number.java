public class For_loop_nth_fibonacci_number {
    public static void main(String[] args) {
        int i, num1, num2, N, fibo=0;
        N = 4;
        num1 = 0;
        num2 = 1;
        System.out.print( num1 + " "+ num2);
        for (i = 3; i <= N; i++) {
            fibo = num1 + num2;
            System.out.print(" "+fibo);
            num1 = num2;
            num2 = fibo;
        }
        System.out.println("\n" + N +"th fibonacci number is: " +fibo);
    }
}
