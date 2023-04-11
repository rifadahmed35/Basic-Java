import java.util.Scanner;

public class For_loop_generate_table {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int N; //N=10;
        System.out.println("Enter the number: ");
        N = input.nextInt();

        int i;
        for (i=1; i<=N; i++){
            System.out.println(N + "*" + i + "=" + N*i);
        }
    }
}
