public class String_builder {
    public static void main(String[] args){
        //String builder (easily changeable)  is almost like a string buffer.
        StringBuilder str = new StringBuilder("Rifad");
        str.append(" Ahmed ");
        str.append(35);
        System.out.println("str = " +str);

        str.reverse();
        System.out.println(str);

        str.delete(2, 8);
        System.out.println(str);
    }
}
