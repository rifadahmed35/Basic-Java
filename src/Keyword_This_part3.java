class individuals3{
    void message(){
        System.out.println("I am message method");
    }
    // Using this keyword we are calling current class method.
    // However, it's not mandatory to use this keyword, in case of class method.
    // We can use either only message(); or this.message();
    void display(){
        this.message();
        System.out.println("I am display method");
    }
}
public class Keyword_This_part3 {
    public static void main(String[] args) {
        individuals3 i1 = new individuals3();
        i1.display();
    }
}
