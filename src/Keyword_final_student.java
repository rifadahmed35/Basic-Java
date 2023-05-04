class University2{

    //final class university2. final class cannot be extended.
    final void display(){
        System.out.println("University info");
    }
}

public class Keyword_final_student extends University2 {

    //If we declare a final keyword in a method, it cannot be overrided. but it can be inherited.
    void display2() {
        super.display();
        System.out.println("Student info");
    }

    public static void main(String[] args) {
        Keyword_final_student s1 = new Keyword_final_student();
        s1.display2();
    }
}
