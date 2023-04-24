class Person2 {
    private String name;
    private int age;
// Press: Alt+Inset
    public void setName(String name) {
        this.name = name;
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
public class Encapsulation_set_get_easyWay {
    public static void main(String[] args) {
        Person2 p1 = new Person2();
        p1.setName("Rifad");
        System.out.println("Name: " +p1.getName());
        p1.setAge(27);
        System.out.println("Name: " +p1.getAge());
    }
}
