public class String_class_demo_2 {
    public static void main(String[] args){
        String firstName = "Rifad";
        String lastName = " Ahmed";

        //Concatenate of string.
        String fullName = firstName + lastName;

        System.out.println("Full name is: " +fullName);

        //Or we can use concatenate (Addition of string) method.

        String fullName2 = firstName.concat(lastName);
        System.out.println("Full name is: " +fullName);

        // All upper case by using toUpperCase

        String upperName = fullName.toUpperCase();
        System.out.println("upper Name : " +upperName);

        // All lower case by using toLowerCase

        String lowerName = fullName.toLowerCase();
        System.out.println("lower Name : " +lowerName);

        // Method of start with and end with.

        boolean b = firstName.startsWith("A");
        System.out.println(b);

        boolean c = lastName.endsWith("ed");
        System.out.println(c);
    }
}
