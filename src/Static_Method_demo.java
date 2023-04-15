class StaticMethod{
    void display1(){
        System.out.println("I am a non-static method");
    }
    static void display2(){
        System.out.println("I am static method");
    }
}
//Restriction of Static method:
//Inside the static method, we can't use non-static method. Instead, we can use static method inside the static method.
//However inside the non-static method, we can use static method.

public class Static_Method_demo {
    public static void main(String[] args) {
        StaticMethod obj = new StaticMethod();
        obj.display1();
        StaticMethod.display2();
    }
}
