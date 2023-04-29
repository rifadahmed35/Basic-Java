class A{
    int x = 10;
}
public class Keyword_Super_part1 extends A {
    int x = 5;
    void displayInformation(){
        System.out.println(x);
        System.out.println(super.x); //"Super Keyword" is used to call super class instance variable.
    }
    public static void main(String[] args) {
        Keyword_Super_part1 obj = new Keyword_Super_part1();
        obj.displayInformation();
    }
}
