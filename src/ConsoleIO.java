import java.util.Scanner;

public class ConsoleIO {
    public static void main(String[] args) {
//        String name = "Chris";
//        String job = "student";
//        String mySentence = String.format("Hi, im %s and im a %s at Codeup.", name, job);
//        System.out.println(mySentence);


//        float currencyInPennies = 1000.00f;
//
//        System.out.printf("I'll sell you swamp land for $%.2f per acre", currencyInPennies);

        Scanner sc = new Scanner(System.in);
//        System.out.println("What is your first name?");
//        String firstName = sc.next();
//        String lastName = sc.next();
//        System.out.printf("Your fist name is: %s\n", firstName);
//        System.out.printf("your last name is: %s\n", lastName);

        /* TODO: use the scanner to take in the name of the month you were born and print it back out
    - remember to first prompt the user for the input
 */

        System.out.print("Enter a number: ");
        int myNum = sc.nextInt();
        System.out.println(myNum);


    }
}
