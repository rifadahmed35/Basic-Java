class Person{
    String name;
    int age;

    void displayInformation1(){
        System.out.println("Name : "+name);
        System.out.println("Age : "+age);
    }
}
public class Inheritance_Teacher extends Person {
    //name, age, displayInformation
    String qualification;
    void displayInformation2(){
        displayInformation1();
        System.out.println("Qualification : "+qualification);
    }
    public static void main(String[] args) {
        Inheritance_Teacher t1 = new Inheritance_Teacher();
        t1.name = "Rifad";
        t1.age = 30;
        t1.qualification = "MSc in Physics";
        t1.displayInformation2();

        Inheritance_Teacher t2 = new Inheritance_Teacher();
        t2.name = "Nadia";
        t2.age = 25;
        t2.qualification = "BSc in BGE";
        t2.displayInformation2();
    }
}
