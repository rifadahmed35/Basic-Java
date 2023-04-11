import java.util.Scanner;

public class Binary_octal_hexa_from_decimal {
    public static void main(String[] args){
        Scanner  input = new Scanner(System.in);
        int decimal; //15
        System.out.println("Enter any decimal number : ");
        decimal = input.nextInt();

        String binary = Integer.toBinaryString(decimal);
        System.out.println("binary = " +binary);

        String octal = Integer.toOctalString(decimal);
        System.out.println("octal = " +octal);

        String hexadecimal = Integer.toHexString(decimal);
        System.out.println("hexadecimal = " +hexadecimal);
    }
}
