class Person5{
    String name;
    private int age;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}
public class Inheriting_Private_Member extends Person5 {
    private String qualification;

    public String getQualification() {
        return qualification;
    }
    public void setQualification(String qualification) {
        this.qualification = qualification;
    }

    public static void main(String[] args) {
        Inheriting_Private_Member teacher1 = new Inheriting_Private_Member();
        teacher1.setName("Rifad");
        teacher1.setAge(27);
        teacher1.setQualification("BSc in Physics");
        System.out.println("Name: "+teacher1.getName());
        System.out.println("Age: "+teacher1.getAge());
        System.out.println("Qualification: "+teacher1.getQualification());
    }
}
