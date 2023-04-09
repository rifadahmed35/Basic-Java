public class Wrapper_class_demo {
    public static void main(String[] args){
        int x =30;
        Integer y = Integer.valueOf(x);
        System.out.println(y);

        Integer z = x; //Autoboxing system. Integer.valueOf(x)---Primitive to Object
        System.out.println(z);

        //Object to primitive data

        Double d = new Double(10.25);
        double e = d.doubleValue();
        System.out.println(e);

        double f = d; //Unboxing system
        System.out.println(f);
    }
}
