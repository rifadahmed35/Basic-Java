public class String_class_demo_3 {
    public static void main(String[] args){
        String country = "  Bangladesh is my  country ";
        System.out.println(country);

        //Using trim method we can remove space from the begging and ending. But not in the middle.

        String S3 = country.trim();
        System.out.println(S3);

        //Using charAt method we can find the character of a particular index.

        String country2 = "Bangladesh is my country ";
        char ch = country2.charAt(4);
        System.out.println("char = " +ch);

        //using codePointAt method we can find ascii value of a character.

        int value = country2.codePointAt(1);
        System.out.println(value);

        //Using indexOf method we can find the position of a character.

        int pos = country2.indexOf("my");
        System.out.println(pos);

        //Using lastIndexOf method we can find the last index of a character. Ex: we have two "a". So we will find
        //the last position of "a".

        int pos2= country2.lastIndexOf("a");
        System.out.println(pos2);
    }
}
