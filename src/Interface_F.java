interface D{
    void play();
}
interface E {
    void play();
}
public class Interface_F implements D, E{
    //Here we are using multiple inheritance. Which is not possible in case of "Class".
    @Override
    public void play() {
        System.out.println("Hellow I'm from F");
    }

    public static void main(String[] args) {
        Interface_F p = new Interface_F();
        p.play();
    }
}
