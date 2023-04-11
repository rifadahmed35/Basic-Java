public class Conversation_string_and_primitive {
    public static void main(String[] args){
        //Convert primitive data to string.
        int x = 100;
        String s = Integer.toString(x);
        System.out.println(s);
        double d = 10.35;
        String ss = Double.toString(d);
        System.out.println(d);

        boolean b = true;
        String sss = Boolean.toString(b);
        System.out.println(sss);

        // Convert string to primitive.

        String s1 = "32";
        int i = Integer.parseInt(s1);
        System.out.println(i);

        //Or:
        int v = Integer.valueOf(s1);
        System.out.println(v);
    }
}
