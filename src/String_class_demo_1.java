public class String_class_demo_1 {
    public static void main(String[] args){

        //String is a sequence of character in normal programming. But in java programming, it is object and
        //this object is a sequence of character

        // String class:
        String s1 = new String ("Rifad Ahmed");
        String s2 = ("rifad Ahmed");

        char s3 [] = {'R', 'i', 'f','a', 'd'};
        System.out.println(s3);

        System.out.println("S1 = " +s1);
        System.out.println("S2 = " +s2);

        //Finding the length of the array.
        int len = s1.length();
        System.out.println(len);

        //Finding the equality of string.
       if(s1.equals(s2)){
           System.out.println("Equals");
       }else{
           System.out.println("Not equals");
       }
       //ignore case for equality.
        if(s1.equalsIgnoreCase(s2)){
            System.out.println("Equals");
        }else{
            System.out.println("Not equals");
        }
        //Uses of contain.

        boolean con = s1.contains("Rifad");
        System.out.println(con);

        // Uses of isEmpty.

        boolean b= s1.isEmpty();
        System.out.println("b = " +b);
    }
}
