class C{  //Super Class
    C(){
        System.out.println("C constructor");
    }
}
public class Keyword_Super_part3 extends C { //Sub-class

    Keyword_Super_part3(){
        super();  //"Super Keyword" is used to call super class constructor.
        System.out.println("Keyword_Super_part3 constructor");
    }
    public static void main(String[] args) {
        Keyword_Super_part3 obj = new Keyword_Super_part3();
    }
}
