public class Java_math_demo {
    public static void main(String[] args) {
        int x, y;
        x= 2;
        y= 4;
        int result;
        result= Math.max(x , y);{
            System.out.println("Maximum number = " + result);
        }
        result= Math.min(x , y);{
            System.out.println("Minimum number = " + result);
        }
        int absolute= Math.abs(y);{
            System.out.println("absolute value of y =" +absolute);
        }
        double power = Math.pow(x, y); {
            System.out.println(" x to the power y = " +power);
        }
        double sqrt= Math.sqrt(x);{
            System.out.println("The square root of x is = " +sqrt);
        }
        double value = Math.cos(0);{
            System.out.println("The value of cos o degree is =" +value);
        }
    }
}
