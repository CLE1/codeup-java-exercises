import jdk.swing.interop.SwingInterOpUtils;

import java.sql.SQLOutput;
import java.util.Scanner;

public class ConsoleExercises {

    public static void main(String[] args) {

//        double pi = 3.14159;
//        System.out.printf("The value of pi is approximately %.2f", pi);
//        String mySentence = String.format("The value of pi is approximately %.2f", pi);
//        System.out.println(mySentence);

        Scanner scanner = new Scanner(System.in);

//        int myNum = sc.nextInt();
//        System.out.println(myNum);

//        System.out.println("Please enter 3 words");
//        String word1 = sc.next();
//        String word2 = sc.next();
//        String word3 = sc.next();
//        System.out.printf("First word: %s\n Second word: %s\n Third word: %s\n", word1, word2, word3);

//
//        System.out.println("Please enter 3 words");
//        String word1 = sc.nextLine();
//        String word2 = sc.nextLine();
//        String word3 = sc.nextLine();
//        System.out.printf("First word: %s\n Second word: %s\n Third word: %s\n", word1, word2, word3);

        System.out.println("Rectangle P/A:");
        System.out.println("Enter Length");

        scanner.useDelimiter("\n");
        String length = scanner.next();
//        double length = scanner.nextDouble();

        System.out.println("Enter Width");

        String width = scanner.next();
//        double width = scanner.nextDouble();


        int perimeter = (Integer.parseInt(length) * 2) + (Integer.parseInt(width));
        int area = (Integer.parseInt(length)) * (Integer.parseInt(width));
//        double perimeter = (length * 2) + (width * 2);
//        double area = (length * width);

        System.out.println("Perimeter: " + perimeter);
        System.out.println("Area: " + area);

//        Integer.parseInt();
    }
}