public class Array_1D_finding_maximum_minimum {
    public static void main(String[] args){
        double number[] = {1, 3, 5, 2, 4};
        double sum = 0;

        for(int i=0; i<number.length; i++){
            sum = sum + number[i];
        }
        System.out.println("The sum is : " + sum);

        double avg = sum/number.length;
        System.out.println("The average is : " + avg);

        double max = number [0];
        double min = number [0];
        for(int i=1; i<number.length; i++){
            if(max<number[i]){
                max = number[i];
            }
            if(min>number[i]){
                min = number[i];
            }
        }
        System.out.println("Maximum number is : " +max);
        System.out.println("Minimum number is : " +min);
    }
}
