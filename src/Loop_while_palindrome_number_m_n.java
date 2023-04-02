public class Loop_while_palindrome_number_m_n {
    public static void main(String[] args) {
        int i, temp, m, n, N, count=0;
        m=10;
        n=100;
        for(i=m; i<=n; i++){
            temp = i;
            int reverse =0;
            while (temp!=0){
                N = temp%10;
                reverse = reverse*10 + N;
                temp = temp/10;
            }
            if(reverse==i){
                System.out.print(" "+i + "\n");
                count++;
            }
        }
        System.out.println("Total no of palindrome from "+ m +"-" + n + " are "+ count );
    }
}
