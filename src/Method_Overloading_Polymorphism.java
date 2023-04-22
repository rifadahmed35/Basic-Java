class Overload{

    // We have 4 "add" similar method here. But parameter list must be different. Ex: int or double type.
    //This method is called overloaded method. Also called Polymorphism.
    //Method name and method list we called this method signature together.
    void add(int a, int b){
        System.out.println(a+b);
    }
    void add(double a, double b){
        System.out.println(a+b);
    }
    void add(int a, int b, int c){
        System.out.println(a+c);
    }
    void add(){
        System.out.println("Nothing to add");
    }
}


public class Method_Overloading_Polymorphism {
    public static void main(String[] args) {
        Overload vale = new Overload();
        vale.add(5,4);
        vale.add(1.2,2.3);
        vale.add(2,5,3);

    }
}
