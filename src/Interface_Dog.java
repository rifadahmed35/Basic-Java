interface Animal1 {
    void eat();
}

class Cat implements Animal1{
    @Override
    public void eat() {
        System.out.println("Cat can eta milk");
    }
}
public class Interface_Dog implements Animal1{

    @Override
    public void eat() {
        System.out.println("Dog can eat egg");
    }

    public static void main(String[] args) {
        //Object of a interface class cannot be created.

        Interface_Dog d = new Interface_Dog();
        d.eat();

        Cat c = new Cat();
        c.eat();
    }
}
