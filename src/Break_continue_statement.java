public class Break_continue_statement {
    public static void main(String[] args) {
        int i;
        for(i=1; i<=100; i++){
            if(i==10){
                continue;
            }
            if(i>15){
                break;}

            System.out.println(i);
        }
    }
}
