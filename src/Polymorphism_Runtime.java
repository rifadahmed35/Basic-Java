class Individual6{

    void display(){
        System.out.println("I am a person");
    }
}
public class Polymorphism_Runtime extends Individual6{
    @Override
    void display() {
        System.out.println("I am a teacher");
    }

    public static void main(String[] args) {
        Individual6 p = new Individual6();
        p.display();

        // Polymorphism is a mechanism where a parent class reference variable can take many forms (It can refer
        //object from different classes.
        p = new Polymorphism_Runtime();
        p.display();

        //That's why it is called Run time polymorphism / dynamic binding --> Method overriding.
    }
}
