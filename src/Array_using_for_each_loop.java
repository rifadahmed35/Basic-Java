public class Array_using_for_each_loop {
    public static void main(String[] args){
        String names[] = {"H", "E", "L", "L", "O", "W"};

        // Traditional loop:
        // for(int i=0; i< names.length; i++){
        //     System.out.print(names[i]);
        // }

        //Now we will use (for each loop):

        for (String x : names){
            System.out.print(x);
        }
        // In case of integer type:
        int num [] = { 1, 2, 3, 4, 5};
        int sum= 0;
        for(int x : num){
            sum = sum + x;
        }
        System.out.println("\n" + "The sum is : " + sum);
    }
}
