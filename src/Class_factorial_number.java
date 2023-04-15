import java.util.Scanner;

class Calculation{

    void fact(int n){
        int fact=1;
        for (int i=1; i<=n; i++){
            fact = fact * i;
        }
            System.out.println("The fact of this number: "+fact);
        }
}

public class Class_factorial_number {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n;
        System.out.println("Enter a number: ");
        n = input.nextInt(); //Example: n=3;
        Calculation result = new Calculation();
        result.fact(n);
    }
}
