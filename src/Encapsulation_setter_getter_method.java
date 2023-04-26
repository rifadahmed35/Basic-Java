class Person1 {
    private String name;
    private int age;

    //Press: Alt+Insert
    public void setName(String n) {
        name = n;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}
public class Encapsulation_setter_getter_method {
    public static void main(String[] args) {
        Person1 p1 = new Person1();
        p1.setName("Rifad");
        System.out.println("Name: " +p1.getName());
        p1.setAge(27);
        System.out.println("Name: " +p1.getAge());
    }
}
