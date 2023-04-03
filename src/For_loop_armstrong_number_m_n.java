public class For_loop_armstrong_number_m_n {
    public static void main(String[] args) {
        int i, j, m, n, temp, sum, N, count=0;
        m = 10;
        n = 1000;
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
