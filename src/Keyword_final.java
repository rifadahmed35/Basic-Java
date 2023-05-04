class University {
    //final keyword is used as declaring the constant variable, and can be modified.
    final String uniName = "MBSTU"; //final variable
    final int fee;  //blank final variable

    //We can initialize the blank final variable by a constructor.
    University (){
        fee = 2000;
    }
    static final String location; //static bank final variable

    // We can't initialize static final variable by constructor. instead we have to static block.

    static {
        location = "Tangail";
    }
    void display() {
        System.out.println(uniName);
        System.out.println(fee);
        System.out.println(location);
    }
}
    public class Keyword_final{
        public static void main(String[] args) {
            University obj = new University();
            obj.display();
        }
}
