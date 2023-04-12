class Teacher1{
    String name, gender;
    long phone;
    void displayInformation(){
        System.out.println("Name : " +name);
        System.out.println("Gender : " +gender);
        System.out.println("Phone no : " +phone);
        System.out.println();
    }
}
public class Class_method_basic {
    public static void main(String[] args) {
        Teacher1 teacher1 = new Teacher1();
        teacher1.name = "Rifad Ahmed";
        teacher1.gender = "Male";
        teacher1.phone = 1629342401;
        teacher1.displayInformation();

        Teacher1 teacher2 = new Teacher1();

        teacher2.name = "Nadia Comonichi";
        teacher2.gender = "Female";
        teacher2.phone = 1615562401;
        teacher2.displayInformation();
    }
}
