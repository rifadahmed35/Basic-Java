abstract class MobileUser{
    // Hide implementation details.
    abstract void sendMessage(); //Abstract method.

    //However, within Abstract class we can create non-abstract method.
    //SO, its not 100% abstract.
    void call(){
        System.out.println("Call method"); //Not abstract method.
    }
}

//Now, if we override, User only show the functionality.
class Karim extends MobileUser{
    @Override
    void sendMessage() {
        System.out.println("Hi I'm Karim");
    }
}
public class Abstraction_User_Rifad extends MobileUser {

    @Override
    void sendMessage() {
        System.out.println("Hi I'm Rifad Ahmed");
    }
    public static void main(String[] args) {
        //In case of Abstraction, It's not possible to create super class object. But we can only create reference variable.

        MobileUser mu; //Reference variable
        mu = new Abstraction_User_Rifad();
        mu.call();
        mu.sendMessage();

        mu = new Karim();
        mu.call();
        mu.sendMessage();
    }
}
