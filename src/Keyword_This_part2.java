class individuals2{
    String name;
    int age;
    double weight;
    individuals2(String name, int age){
        this.name = name;
        this.age = age;
    }
    //Using this keyword we are calling current class constructor.
    individuals2(String name, int age, double weight){
        this(name,age);
        this.weight = weight;
    }
    void displayInformation(){
        System.out.println(name);
        System.out.println(age);
        System.out.println(weight);
        System.out.println();
    }
}
public class Keyword_This_part2 {
    public static void main(String[] args) {
        individuals2 obj = new individuals2("Rifad", 25);
        obj.displayInformation();
        individuals2 obj2 = new individuals2("Ahmed", 27, 65.5);
        obj2.displayInformation();
    }
}
