import java.util.ArrayList;
import java.util.Iterator;

public class Array_list_demo_2 {
    public static void main(String[] args) {

        ArrayList<Integer> number = new ArrayList<>();
        System.out.println("Size = " + number.size());

        //New we are adding element.
        number.add(10);
        number.add(20);
        number.add(30);
        number.add(3, 10);

        //Using for each loop:
        System.out.print("After adding array contains:");
        for (int x : number){
            System.out.print(" " +x);
        }
        //Using Iterator loop:
        System.out.println();
        Iterator itr = number.iterator();
        System.out.print("After adding array contains:");
        while(itr.hasNext()){
            System.out.print(" " +itr.next());
        }
        System.out.println();
        System.out.println("Size : " +number.size());

        //Now we are removing the elements:

        number.remove(2);
        System.out.println("After removing array contains: " +number);

        //number.removeAll(number);
        //System.out.println("After removing all array: " +number);

        //Or we can use clear method instead of removeAll method.

        number.clear();
        System.out.println("After clearing all array: " +number);

    }
}
