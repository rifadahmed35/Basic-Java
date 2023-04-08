public class String_buffer {
    public static void main(String[] args){
         //Don't need to create new variable for chaning or replace any character by using a method.

        // Either-- String s1 = "Rifad"
        // StringBuffer sb = new StringBuffer(s1);
        //Or:
        StringBuffer sb = new StringBuffer("Rifad");
        System.out.println(sb);

        //Now we can add new string or integer with previous one by using append method.

        sb.append(" Rifad Ahmed ");
        sb.append(35);
        System.out.println(sb);

        //We can delete character by putting from index to index.

        sb.delete(0, 5);
        System.out.println(sb);

        //We can fix the length of string by using setLength method.

        sb.setLength(5);

        //We can reverse now by using reverse method.

        sb.reverse();
        System.out.println(sb);



    }
}
