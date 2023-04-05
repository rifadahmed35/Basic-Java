public class String_class_array {
    public static void main(String[] args){
        String name[] = {"Md", "Rifad", "Ahmed"};
        for(int i=0; i< name.length; i++){
            System.out.print(name[i] + " ");
        }
        // Using for each loop
        System.out.println();
        for(String x: name){
            System.out.print(x + " ");
        }
    }
}
