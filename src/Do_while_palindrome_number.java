public class Do_while_palindrome_number {
    public static void main(String[] args) {
        int num, N, temp, reverse=0;
        num=121;
        temp=num;  //temp means temporary variable.
        do{
            N = temp%10;
            reverse = reverse*10 + N;
            temp = temp/10;
        }while(temp!=0);
        System.out.println(reverse);
        if(reverse == num){
            System.out.println("The number is palindrome");
        }else {
            System.out.println("It's not a palindrome");
        }
    }
}
