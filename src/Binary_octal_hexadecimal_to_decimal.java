public class Binary_octal_hexadecimal_to_decimal {
    public static void main(String[] args){
        String binary = "1010";
        int decimal = Integer.parseInt(binary, 2);
        System.out.println("decimal = " +decimal);

        String octal = "657";
        int decimal2 = Integer.parseInt(octal, 8);
        System.out.println("decimal2 = " +decimal2);

        String hexadecimal = "AB"; // A=10, B=11;
        int decimal3 = Integer.parseInt(hexadecimal, 16);
        System.out.println("decimal3 = " +decimal3);
    }
}
