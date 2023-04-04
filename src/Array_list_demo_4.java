import java.util.ArrayList;

public class Array_list_demo_4 {
    public static void main(String[] args){
        ArrayList<Integer> number1 = new ArrayList<>();
        ArrayList<Integer> number2 = new ArrayList<>();
        ArrayList<Integer> number3 = new ArrayList<>();

        number1.add(3);
        number1.add(5);
        number1.add(7);
        number1.add(9);
        System.out.println("Primary list of array 01: " +number1);

        number2.add(6);
        number2.add(8);
        number2.add(10);
        number2.add(12);
        System.out.println("Primary list of array 02: " +number2);

        //Using addAll method we can add a variable into a new variable.

        number3.addAll(number1);
        System.out.println("Primary list of array 03: " +number3);

        //Using equals method we can check the two array either equal or nor.

        boolean x = number1.equals(number2);
        System.out.println("number1 = number2 : " +x);

        boolean x2 = number1.equals(number3);
        System.out.println("number1 = number3 : " +x2);
    }
}
