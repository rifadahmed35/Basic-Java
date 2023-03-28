public class Bitwise_operator_AND_OR_ExOR {
    public static void main(String[] args) {
        int a,b,c;
        a=32;    //1 0 0 0 0 0
        b=12; //   0 0 1 1 0 0
        c = a&b; //multiplication AND operator
        System.out.println("a & b=" +c);

        c = a|b; //addition, OR operator
        System.out.println("a | b=" +c);

        c = a^b; //addition, Exor operator
        System.out.println("a ^ b=" +c);
    }
}
