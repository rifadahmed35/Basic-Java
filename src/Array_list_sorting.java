import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;

public class Array_list_sorting {
    public static void main(String[] args) {
        ArrayList<Integer> number = new ArrayList<>();

        number.add(4);
        number.add(5);
        number.add(8);
        number.add(10);
        System.out.println("Before sorting: " +number);

        //Using Collections.sort method we can sort out in ascending order.
        Collections.sort(number);
        System.out.println("After sorting in ascending order: " +number);

        //Using Collections.reverseOrder we can sort out in descending order.
        Collections.sort(number, Collections.reverseOrder());
        System.out.println("After sorting in descending order: " +number);
    }
}
