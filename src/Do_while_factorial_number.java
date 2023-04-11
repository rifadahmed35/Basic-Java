import java.util.Scanner;

public class Do_while_factorial_number {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int i;
        System.out.println("Enter a number: ");
        i = input.nextInt(); //i=3;
        int fact=1;
        do {
            fact = fact * i;
            i--;
        }while(i>=1);
        System.out.println(fact);
    }
}
