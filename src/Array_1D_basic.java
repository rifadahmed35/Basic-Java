public class Array_1D_basic {
    public static void main(String[] args){
        int [] number = new int[5]; //declaration and creation.
        number[0] =10; //Initialization
        number[1] =12;
        number[2] =13;
        number[3] =15;
        number[4] =16;
        System.out.println(number[2]); //Printing particular array

        int len = number.length;
        System.out.println("Length of the array is : " +len); //printing size of the array

        int sum = number[0] + number[2] + number[4];
        System.out.println("Sum = " +sum); //Summation of the array

    }
}
