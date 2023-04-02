public class For_loop_palindrome_number_m_n {
    public static void main(String[] args) {
        int i, N, n, m, temp, reverse, count=0;
        m=10;
        n=121;
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
