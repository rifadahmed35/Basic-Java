public class Loop_while_armstrong_number_m_n {
    public static void main(String[] args) {
        int i, m, n, N, sum, temp, count=0;
        m=10;
        n=1000;
        for(i=m ; i<=n; i++){
            temp = i;
            sum = 0;
            while(temp!=0){
                N = temp%10;
                sum = sum + N*N*N;
                temp = temp/10;
            }if(sum==i){
                System.out.println(i);
                count++;
            }
        }
        System.out.println("Total armstrong number from " + m + " to " + n + " is :" +count);
    }
}
