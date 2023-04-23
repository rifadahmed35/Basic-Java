class CallByReference{
    String name;
    void change(CallByReference r2){   // r2 is a formal parameter
        r2.name = "Rifad";
    }
}
public class Argument_passing_Call_by_reference {
    public static void main(String[] args) {
        CallByReference r1 = new CallByReference();
        r1.name = "Nadia";  // r1 is actual parameter.
        System.out.println("before calling : "+r1.name);

        r1.change(r1);
        System.out.println("after calling : "+r1.name);
    }
}
