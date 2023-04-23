class CallByValue{
    void change(int i){ // Here i is a formal parameter.
        i = 20;
    }
}

public class Argument_passing_Call_by_value{
    public static void main(String[] args) {
        CallByValue ob = new CallByValue();
        int x = 10; //Original parameter
        System.out.println("x before call :" +x);

        ob.change(x);
        System.out.println("x after call : "+x);
    }
}
