public class Loop_for_palindrome_number {
    public static void main(String[] args) {
        int num, temp, N, reverse=0;
        num=12121;
        temp=num;
        for(; temp!=0; temp=temp/10){
            N = temp%10;
            reverse = reverse*10 + N;
        }System.out.println(reverse);
        if(num==reverse){
            System.out.println("The number is palindrome");
        }else{
            System.out.println("It's not a palindrome number");
        }

    }
}
