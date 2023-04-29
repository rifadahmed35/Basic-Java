class Individuals{
    String name;
    int age;
    // We can't use static and final keyword in overriding.
    // We can't override in java main method. Because it's a static method (public static void main(String[] args) { }

    void displayInformation(){
        System.out.println("Name: "+name);
        System.out.println("Age: "+age);
    }
}
public class Method_Overriding extends Individuals{
    String qualification;
    @Override
    void displayInformation(){
        System.out.println("Name: "+name);
        System.out.println("Age: "+age);
        System.out.println("Qualification: "+qualification);
    }

    public static void main(String[] args) {
        Method_Overriding m1 = new Method_Overriding();
        m1.name = "Rifad";
        m1.age = 27;
        m1.qualification = "MSc in Materials Science";
        m1.displayInformation();

        Individuals i1 = new Individuals();
        i1.name = "Nadia";
        i1.age = 24;
        i1.displayInformation();
    }
}
