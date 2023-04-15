class ReturningValueDemo {
    int square(int value) {
        return value * value;
    }
}
public class Returning_value_Test {
    public static void main(String[] args) {
        ReturningValueDemo obj1 = new ReturningValueDemo();
        int result = obj1.square(4);
        System.out.println("The square of the value is: "+result);

        ReturningValueDemo obj2 = new ReturningValueDemo();
        int result2 = obj2.square(3);
        System.out.println("The square of the value is: "+result2);
    }
}
