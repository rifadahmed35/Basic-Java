import java.util.Scanner;

public class For_loop_fibonacci_series_without_recursion {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n; //n=4;
        System.out.println("Enter the number : ");
        n = input.nextInt();

        int i, num1, num2, fibo;
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
