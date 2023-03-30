import java.util.Arrays;

public class Array_sorting_ascending_descending {
    public static void main(String[] args){
        int number[] = {10, -5, 8, 6, 3};
        Arrays.sort(number); //At first we are sorting the number.

        // Ascending means small number to big number sorting.
        System.out.print("Ascending : ");
        for(int i=0; i<5; i++){
            System.out.print(" " +number[i]);
        }
        System.out.println();
        //Descending means big  to small number sorting
        System.out.print("Descending : ");
        for(int i=4; i>=0; i--){
            System.out.print(" " +number[i]);
        }
        System.out.println();
        //String array.

        String names[] = { "Dhaka", "Bangladesh", "America", "Canada"};
        Arrays.sort(names);

        System.out.print("Ascending : ");
        for(int i=0; i<4; i++){
            System.out.print(" " +names[i]);
        }
        System.out.println();
        System.out.print("Descending : ");
        for(int i=3; i>=0; i--){
            System.out.print(" " +names[i]);
        }
    }
}
