class University3{
    final void display(){
        System.out.println("University info");
    }
}

public class Keyword_final_lastPart extends University3{

    //If we declare a final keyword in a method, it cannot be overrided. but it can be inherited.
    void display2() {
        super.display();
        System.out.println("Student info");
    }
    public static void main(String[] args) {
        Keyword_final_lastPart obj = new Keyword_final_lastPart();
        obj.display2();
    }
}
