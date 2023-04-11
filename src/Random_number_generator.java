import java.util.Random;

public class Random_number_generator {
    public static void main(String[] args) {
        Random rand = new Random();

        int randomNumber = rand.nextInt(10);  //1 to 10
        System.out.println("Random number = "+randomNumber);

        int randomNumber1 = rand.nextInt(10)+1;  //1 to 10
        System.out.println("Random number1 = "+randomNumber1);

        int randomNumber2 = rand.nextInt(6) +5;  //5 to 10
        System.out.println("Random number2 = "+randomNumber2);

        int randomNumber3 = rand.nextInt(91) +10; //10 to
        System.out.println("Random number3 = "+randomNumber3);

    }
}
