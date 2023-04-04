import java.util.ArrayList;

public class Array_list_demo_1 {
    public static void main(String[] args){

        ArrayList<Integer> number = new ArrayList<>();
        System.out.println("Size = "+number.size());

        //New we are adding element.
        number.add(10);
        number.add(20);
        number.add(30);
        number.add(3, 10);

            System.out.println(number);
            System.out.println("Size = " +number.size());
    }

}
