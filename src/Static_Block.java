class StaticBlock{
    static int id;
    static String name;

    static {          //This is called Static block.
        id = 15035;
        name = "Rifad";
    }
    static void display(){
        System.out.println(id);
        System.out.println(name);
    }
}
public class Static_Block {
    public static void main(String[] args) {
        StaticBlock.display();
    }
}
