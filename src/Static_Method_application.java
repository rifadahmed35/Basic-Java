class Student2{
    int rollno;
    String name;
    static String college = "TUD";
    //static method to change the value of static variable
    static void change(){
        college = "MBSTU";
    }
    //constructor to initialize the variable
    Student2(int r, String n){
        rollno = r;
        name = n;
    }
    //method to display values
    void display(){
        System.out.println(rollno+" "+name+" "+college);
    }
}
//Test class to create and display the values of object
public class Static_Method_application {
    public static void main(String[] args) {
        Student2.change();//calling change method
        //creating objects
        Student2 s1 = new Student2(111, "Karan");
        Student2 s2 = new Student2(122, "Aryan");
        Student2 s3 = new Student2 (123, "Sonoo");
        //calling display method
        s1.display();
        s2.display();
        s3.display();
    }
}
