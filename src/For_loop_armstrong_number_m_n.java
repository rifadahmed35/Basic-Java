import java.util.Scanner;

public class For_loop_armstrong_number_m_n {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int m, n;
        System.out.println("Enter first numbers: ");
        m = input.nextInt(); //10
        System.out.println("Enter second numbers: ");
        n = input.nextInt(); //1000
        int i, temp, sum, N, count=0;
        for (i = m; i <= n; i++) {
            temp = i;
            sum = 0;
            for (; temp != 0; temp = temp / 10) {
                N = temp % 10;
                sum = sum + N * N * N;
            }
            if (sum == i) {
                System.out.println(i);
                count++;
            }
        }
        System.out.println("Total armstrong number from " + m + " to " + n + " is: " +count );
    }
}
