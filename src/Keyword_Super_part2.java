class B{
  void displayInformation(){
      System.out.println("Inside A class");
  }
}
public class Keyword_Super_part2 extends B{
    //displayInformation
    @Override
    void displayInformation(){
        super.displayInformation(); //"Super Keyword" is used to call super class method.
        System.out.println("Inside B class");
    }
    public static void main(String[] args) {
        Keyword_Super_part2 obj = new Keyword_Super_part2();
        obj.displayInformation();
    }
}
