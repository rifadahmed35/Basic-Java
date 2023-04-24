import java.util.Scanner;

class FactorialDemo{
    int fact(int n){
        if (n==1)
            return 1;
        else
            return n * (n-1);
    }
}

public class Recursion_factorial_number {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int num;
        System.out.println("Enter the number :");
        num= input.nextInt();

        FactorialDemo obj = new FactorialDemo();
        int result = obj.fact(num);
        System.out.println("Factorial of the number is : " +result);
    }
}
