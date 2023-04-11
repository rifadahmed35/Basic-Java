import java.util.Scanner;

public class For_loop_palindrome_number_m_n {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int m, n;
        System.out.println("Enter first number: ");
        m = input.nextInt(); // m=10;
        System.out.println("Enter second number: ");
        n = input.nextInt(); // n=121;
        int i, N,temp, reverse, count=0;
        for(i=m; i<=n; i++) {
            temp = i;
            reverse=0;
            for (;temp != 0;  temp = temp/10) {
                N = temp % 10;
                reverse = reverse*10 + N;

            }
            if (reverse == i) {
                System.out.println(" " + i);
                count++;
            }
        }
        System.out.println("Total palindrome number from " + m + " to " + n + " are : " +count);
    }
}
