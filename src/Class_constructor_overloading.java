class Teacher5{
    String name, gender;
    long phone;

    Teacher5(){
        System.out.println("No information");
    }
    Teacher5(String n, String g){
        name =n;
        gender = g;
    }
    Teacher5(String n, String g, long ph){
        name =n;
        gender = g;
        phone = ph;
    }
    void displayInformation(){
        System.out.println("Name: " +name);
        System.out.println("Gender: " +gender);
        System.out.println("Phone no: " +phone);
        System.out.println();
    }
}

public class Class_constructor_overloading {
    public static void main(String[] args) {
        Teacher5 teacher1 = new Teacher5();

        Teacher5 teacher2 = new Teacher5("Rifad", "Male");
        teacher2.displayInformation();

        Teacher5 teacher3 = new Teacher5("Nadia", "Female", 1629342401);
        teacher3.displayInformation();
    }
}
