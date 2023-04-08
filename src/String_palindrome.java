public class String_palindrome {
    public static void main(String[] args){
        String s1 = "Madam";
        StringBuffer sb = new StringBuffer(s1);
        System.out.println(sb);
        String s2 = sb.reverse().toString();
        if(s1.equals(s2)){
            System.out.println("Palindrome");
        }else{
            System.out.println("Not a palindrome");
        }
    }
}
