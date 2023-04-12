class Teacher2{
    String name, gender;
    long phone;

    void setInformation(String n, String m, long ph){
        name = n;
        gender = m;
        phone = ph;
    }
    void displayInformation(){
        System.out.println("Name : " +name);
        System.out.println("Gender : " +gender);
        System.out.println("Phone no : " +phone);
        System.out.println();
    }
}
public class Class_method_parametrized {
    public static void main(String[] args) {
        Teacher2 teacher1 = new Teacher2();
        teacher1.setInformation("Rifad Ahmed", "Male", 1629342401 );
        teacher1.displayInformation();

        Teacher2 teacher2 = new Teacher2();
        teacher2.setInformation("Nadia Comonichi", "Female", 1629342501);
        teacher2.displayInformation();
    }
}
