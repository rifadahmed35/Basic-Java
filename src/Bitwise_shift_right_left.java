public class Bitwise_shift_right_left {
    public static void main(String[] args) {
        int a=32, c;
        c = a>>2; //Bitwise right shift a>>2 means, 32/2=16, 16/2= 8, two times division to the right side . ( 32 16 8 4 2 1)
        {
            System.out.println("a>>2 =" +c);
        }
        c = a>>3; // three time division to the right side.
        {
            System.out.println("a>>3 =" + c);
        }
        int b = 4, d;
        d = b<<2; //Bitwise left shift a<<2 means, 4*2= 8, 8*2=16, two time multiplication to the left side.
        {
            System.out.println("b<<2 = " +d);
        }
        d = b<<4;
        {
            System.out.println("b<<d = " +d);
        }
    }
}
