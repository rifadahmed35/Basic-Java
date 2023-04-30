class individuals1{
    String name; //Instance variable
    int age;
    //Using this keyword we are calling current class instance variable.
    individuals1(String name, int age){  // Local variable.
        this.name = name; //Using this keyword, we can clarify that we put the local variable into the instance variable.
        this.age = age; // N.B: Only when instance and local variable are the same name.
    }
    void displayInformation(){
        System.out.println(name);
        System.out.println(age);
    }
}
public class Keyword_This_part1 {
    public static void main(String[] args) {
       individuals1 obj = new individuals1("Rifad", 27);
        obj.displayInformation();
    }
}
