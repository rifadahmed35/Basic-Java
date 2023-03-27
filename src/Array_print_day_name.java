public class Array_print_day_name {
    public static void main(String[] args){
        String day [] = {"Saturday", "Sunday", "Monday", "Tuesday", "Wednesday", "Thursday", "Friday" };
        int number = 3;
        if(number<=day.length){
            switch (number){
                case 1:
                    System.out.println(day [0]);
                    break;
                case 2:
                    System.out.println(day[1]);
                    break;
                case 3:
                    System.out.println(day[2]);
                    break;
                case 4:
                    System.out.println(day[3]);
                    break;
                case 5:
                    System.out.println(day[4]);
                    break;
                case 6:
                    System.out.println(day[5]);
                    break;
                case 7:
                    System.out.println(day[6]);
                    break;
            }

        }
        // Another way:

        for(int i=0; i< day.length; i++){
            if(number==i+1){
                System.out.println(day[i]);
            }
        }

    }
}
