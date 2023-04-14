class Teacher3{
    String name, gender;
    long phone;

    //Contractor is a special type of method which don't need to call like a setInformation. It can be called automatically.
    //Also, Return type won't be existed in constructor.
    //It will be named according to the class.

    Teacher3(String n, String g, long ph){
        name = n;
        gender = g;
        phone = ph;
    }
    void displayInformation(){
        System.out.println("Name : " +name);
        System.out.println("Gender : " +gender);
        System.out.println("Phone no : " +phone);
        System.out.println();
    }
}
public class Class_constructor_parametrized {
    public static void main(String[] args) {
        // We use constructor because, when we create object then we can initialize in the first line.
        //"""Teacher2 teacher1 = new Teacher2(); """
        //So, we don't need """teacher1.setInformation("Rifad Ahmed", "Male", 1629342401 );""" this line anymore.

        Teacher3 teacher1 = new Teacher3("Rifad Ahmed", "Male", 1629342401);
        teacher1.displayInformation();

        Teacher3 teacher2 = new Teacher3("Nadia Comonichi", "Female", 1629342501);
        teacher2.displayInformation();
    }
}
