public class Math_Demo {
    public static void main(String[] args) {
        double x = Math.abs(-9.2);
        System.out.println(x);

        //Or, we can print directly by printing method.

        System.out.println(Math.abs(-5.2));
        System.out.println(Math.pow(2, 3 ));
        System.out.println(Math.sqrt(4));
        System.out.println(Math.PI);
        System.out.println(Math.log(10));
        System.out.println(Math.exp(1));
        System.out.println(Math.max(10, 25));
        System.out.println(Math.min(10, 25));
        System.out.println(Math.addExact(5,4));

        //Ceiling method: Go from bottom to top.
        System.out.println(Math.ceil(-5.4));

        //Floor method: Go from top to bottom.
        System.out.println(Math.floor(5.5));
    }
}
