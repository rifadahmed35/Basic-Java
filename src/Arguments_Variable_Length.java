class Varargs{
    void add(int ... num){
        int sum = 0;
        for(int x : num){
            sum = sum + x;
        }
        System.out.println("The addition is : " +sum);
    }
    void add2(int ... num){
        int multi = 1;
        for(int x : num){
            multi = multi * x;
        }
        System.out.println("The multiplication is is : " +multi);
    }
}

public class Arguments_Variable_Length {
    public static void main(String[] args) {
        Varargs obj = new Varargs();
        obj.add(5, 7, 3, 5);

        Varargs obj2 = new Varargs();
        obj2.add2(5, 3, 2);
    }
}
