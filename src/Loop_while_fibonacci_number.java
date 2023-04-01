public class Loop_while_fibonacci_number {
    public static void main(String[] args) {
        int N, fibo=0;
        N=5;
        int num1 = 0;
        int num2 = 1;
        System.out.print(num1 + " " +num2);
        int i =3;
        while(i<=N){
            fibo = num1 + num2;
            System.out.print(" " +fibo);
            num1 = num2;
            num2 = fibo;
            i++;
        }
        System.out.print("\n" + N +"th fibonacci number is: " + fibo);
    }
}
