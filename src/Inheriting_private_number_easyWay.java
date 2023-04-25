class Person6{
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
public class Inheriting_private_number_easyWay extends Person6{
    private String qualification;

    public String getQualification() {
        return qualification;
    }
    public void setQualification(String qualification) {
        this.qualification = qualification;
    }

    //Here we can set all printing information. This is the easiest way for printing information.
    void displayInformation3(){
        System.out.println("Name: "+getName());
        System.out.println("Age: "+getAge());
        System.out.println("Qualification: "+getQualification());
    }
    public static void main(String[] args) {
        Inheriting_private_number_easyWay teacher1 = new Inheriting_private_number_easyWay();
        teacher1.setName("Rifad");
        teacher1.setAge(27);
        teacher1.setQualification("BSc in Physics");
        teacher1.displayInformation3();
        Inheriting_private_number_easyWay teacher2 = new Inheriting_private_number_easyWay();
        teacher2.setName("Nadia");
        teacher2.setAge(24);
        teacher2.setQualification("BSc in BGE");
        teacher2.displayInformation3();
    }
}
