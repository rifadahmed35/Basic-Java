public class String_class_demo_4 {
    public static void main(String[] args){
        String s1 = " This is my country";
        System.out.println(s1);
        //Using replace method use can substitute a character.

        String s2 = s1.replace('i', 'j');
        System.out.println(s2);

        //Using split method we can slice of a string in a different way.

       String s3[] = s1.split(" ");

       for( String x: s3){
           System.out.println(x);
       }
       System.out.println();
       //Now we will split on the basis of underscore.
        String s4 = "This_is_my country";
        String s5[] = s4.split("_");

        for( String x: s5){
            System.out.println(x);
        }

    }
}
