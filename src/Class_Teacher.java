class Teacher{
    String name,gender;
    long phone;
}
public class Class_Teacher {
    public static void main(String[] args) {
        // Teacher teacher1; //Teacher is "Class" and here we "declare an Object".
        // teacher1 = new Teacher(); // Then we create an Object.

        //However, we can make it in a single row:

        Teacher teacher1 = new Teacher();

        //Then we will add the characteristics of Teacher class inside the object of teacher1.

        teacher1.name = "Rifad Ahmed";
        teacher1.gender = "Male";
        teacher1.phone = 1629342401;

        System.out.println("Name : " +teacher1.name);
        System.out.println("gender : " +teacher1.gender);
        System.out.println("Phone no : " +teacher1.phone);

        System.out.println();

        Teacher teacher2 = new Teacher();

        teacher2.name = "Nadia Comonichi";
        teacher2.gender = "Female";
        teacher2.phone = 1615562401;

        System.out.println("Name : " +teacher2.name);
        System.out.println("gender : " +teacher2.gender);
        System.out.println("Phone no : " +teacher2.phone);


    }
}
