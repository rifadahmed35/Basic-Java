class Teacher4 {
    String name, gender;
    long phone;
    //Default Constructor:
    Teacher4(){
        System.out.println("No value");
    }
    //Parametrized Constructor:
    Teacher4(String n, String g, long ph){
        name = n;
        gender=g;
        phone=ph;
    }
    void displayInformation(){
        System.out.println("Name : " +name);
        System.out.println("Gender : " +gender);
        System.out.println("Phone no : " +phone);
        System.out.println();
    }
}

public class Class_constructor_default {
    public static void main(String[] args) {
        Teacher4 teacher1 = new Teacher4("Rifad", "Male", 1629342401);
        teacher1.displayInformation();

        Teacher4 teacher2 = new Teacher4("Nadia", "Female", 1629262401);
        teacher2.displayInformation();

        Teacher4 teacher3 = new Teacher4();
        teacher3.displayInformation();
        //In case, if we don't set default constructor,
        // and there is no data, compiler will be set automatically a default constructor.
    }
}
