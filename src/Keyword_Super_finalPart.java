class Vehicle{
    String brand;
    String colour;
    double weight;
    Vehicle(String n, String c, Double w){
        brand = n;
        colour = c;
        weight = w;
    }
    void information(){
        System.out.println("Brand: "+brand);
        System.out.println("Colour: "+colour);
        System.out.println("Weight: "+weight);
    }
}
public class Keyword_Super_finalPart extends Vehicle{
    //Brand, colour, weight, information

    int speed;
    Keyword_Super_finalPart(String n, String c, Double w, int s){
        super(n, c, w);  //Calling the constructor of Vehicle class.
        speed = s;
    }
    @Override
    void information(){
        super.information();
        System.out.println("Speed:" +speed);
        System.out.println();
    }

    public static void main(String[] args) {
        Keyword_Super_finalPart car1 = new Keyword_Super_finalPart("BMW", "Black", 450.5, 1000);
        car1.information();
        Keyword_Super_finalPart car2 = new Keyword_Super_finalPart("BMW", "White", 550.5, 900);
        car2.information();
    }

}
