public class Array_finding_sum_average {
    public static void main(String[] args){
        double number[] = {1, 3, 5, 2, 4};
        double sum = 0;
        //number[0] = 1;
        //number[1] = 3;
        //number[2] = 5;
        //number[3] = 2;
        //number[4] = 1;
        //We can use loop for more shortcut.
        for(int i=0; i<number.length; i++){
            sum = sum + number[i];
        }
        System.out.println("The sum is : " + sum);

        double avg = sum/number.length;
        System.out.println("The average is : " + avg);
    }
}
