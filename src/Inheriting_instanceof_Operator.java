class Animal{

}

public class Inheriting_instanceof_Operator extends Animal{
    public static void main(String[] args) {
        Animal a = new Animal();
        Inheriting_instanceof_Operator i = new Inheriting_instanceof_Operator();

        System.out.println(i instanceof Animal);
        System.out.println(a instanceof Animal);
        System.out.println(a instanceof Inheriting_instanceof_Operator);
    }
}
