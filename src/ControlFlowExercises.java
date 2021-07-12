import java.util.Locale;
import java.util.Scanner;

public class ControlFlowExercises {
    public static void main(String[] args) {

//        int i = 5;
//        while (i <= 15) {
//            System.out.println("i is " + i);
//            i++;
//        }

       // ---------------

//        int y = 0;
//        do {
//            System.out.println(y);
//            y += 2;
//        }while(y <= 100);

        //-----------------

//        int y = 100;
//        do {
//            System.out.println(y);
//            y -= 5;
//        }while(y >= -10);

        //------------------

//        long y = 2;
//        do {
//            System.out.println(y);
//            y *= y;
//        }while(y <= 1000000);

        //-------------------

//        for (int i = 5; i <= 15; i += 1){
//            System.out.println(i);
//
//        }

        //--------------------

//        for (int y = 0; y <= 100; y += 2){
//            System.out.println(y);
//
//        }

        //-------------------------

//        for (int y = 100; y >= -10; y -= 5){
//            System.out.println(y);
//
//        }

        //---------------------

//        for (long y = 2; y <= 1000000; y *= y){
//            System.out.println(y);
//
//        }

        //---------------------

//        for (int y = 1; y <= 100; y ++){
//            if (y % 15 == 0){
//                System.out.println("FizzBuzz");
//            }
//            else if (y % 5 == 0){
//                System.out.println("Buzz");
//            }
//            else if (y % 3 == 0){
//                System.out.println("Fizz");
//            } else {
//                System.out.println(y);
//            }
//        }


        //---------------------


//        while (true){
//            Scanner scanner = new Scanner(System.in);
//
//            System.out.println("What number would you like to go up to?");
//
//            int input = scanner.nextInt();
//
//            System.out.println("Here is your table! \n");
//
//            System.out.println("number | squared | cubed");
//
//            System.out.println("------ | ------- | -----");
//
//            for (int i = 1; i <= input; i++){
//                int squared = i * i;
//
//                int cubed = i * i * i;
//
//                System.out.println(i + "      | " + squared + "\t\t| " + cubed);
//            }
//
//            System.out.println("Would you like to continue?");
//
//            String prompt = scanner.next().toLowerCase();
//
//            if (prompt.equals("yes")){
//                continue;
//            } else {
//                System.out.println("come again.");
//            } break;
//
//        }

        //------------------------

        while (true){
            Scanner scanner = new Scanner(System.in);

            System.out.println("enter number from 1 to 100 to get grade");

            int grade = scanner.nextInt();

            if (grade >= 97){
                System.out.println("your garde is an A+");
            } else if (grade >= 93){
                System.out.println("Your grade is an A");
            } else if (grade >= 90){
                System.out.println("Your grade is an A-");
            } else if (grade >= 87){
                System.out.println("Your grade is a B+");
            } else if (grade >=83){
                System.out.println("Your grade is a B");
            } else if (grade >= 80){
                System.out.println("Your grade is a B-");
            } else if (grade >= 77){
                System.out.println("Your grade is a C+");
            } else if (grade >= 73){
                System.out.println("Your grade is a C");
            } else if (grade >=70){
                System.out.println("Your grade is a C-");
            } else if (grade >= 67){
                System.out.println("Your grade is a D+");
            } else if (grade >= 63){
                System.out.println("Your grade is a D");
            } else if (grade >= 60){
                System.out.println("Your grade is a D-");
            } else {
                System.out.println("Your grade is an F");
            }

            System.out.println("Would you like to continue?");

            String prompt = scanner.next().toLowerCase();

            if (prompt.equals("yes")){
                continue;
            } else {
                System.out.println("come back and enter your number to get your grade again.");
            } break;

        }




    }
}
