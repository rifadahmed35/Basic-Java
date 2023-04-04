import java.util.ArrayList;

public class Array_list_demo_3 {
    public static void main(String[] args){
        ArrayList<Integer> number = new ArrayList<>();

        number.add(4);
        number.add(5);
        number.add(8);
        number.add(10);
        System.out.println("Primary elements: "+number);
        //Using contains method we check a element which I am finding for.
        boolean object = number.contains(8);
        System.out.println("8 is in the list : " +object);

        boolean object2 = number.contains(30);
        System.out.println("30 is in the list : " +object2);

        //Using Index method we can find out the index of the element.
        int position= number.indexOf(8);
        System.out.println("Index of 8 is : " +position);

        //Using set method we can replace the elements in a index.

        number.set(2, 7);
        number.set(3,9);
        System.out.println("After replacing: " +number);

        //Using get method, we can see the element in a particular index.
        int x = number.get(3);
        System.out.println("Object in 3rd index is: "+x);

        //We can check the array list is either empty or not. If its empty then it's true. Otherwise, it's false.
        boolean check1 = number.isEmpty();
        System.out.println("Array list empty : " +check1);

        //If we clear the array list:
        number.clear();
        boolean check2 = number.isEmpty();
        System.out.println("Array list empty : " +check2);

    }
}
