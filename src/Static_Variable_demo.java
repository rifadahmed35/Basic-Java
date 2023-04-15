class Student{
    String name;
    int id;
    static String uniName = "MBSTU";

    Student(String n, int i){
        name = n;
        id = i;
    }
    void displayInformation(){
        System.out.println("Name : "+name);
        System.out.println("ID No: "+id);
        System.out.println("University Name: "+uniName);
        System.out.println();
    }
}

public class Static_Variable_demo {
    public static void main(String[] args) {
        Student student1 = new Student("Rifad",  15035);
        student1.displayInformation();

        Student student2 = new Student("Nadia",  19032);
        student2.displayInformation();
    }
}
