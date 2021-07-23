package grades;

import java.util.HashMap;
import java.util.Scanner;

public class GradesApplication {
    public static HashMap<String, Student> students = new HashMap<>();
    public static Scanner sc = new Scanner(System.in);


    public static void main(String[] args) {
        application();
    }

    public static void application() {
        HashMap<String, Student> students = new HashMap<>();
        Student Jesse = new Student("Jesse");
        Jesse.addGrade(91);
        Jesse.addGrade(88);
        Jesse.addGrade(77);

        Student Michelle = new Student("Michelle");
        Michelle.addGrade(85);
        Michelle.addGrade(83);
        Michelle.addGrade(72);

        Student Aly = new Student("Aly");
        Aly.addGrade(81);
        Aly.addGrade(90);
        Aly.addGrade(88);

        Student Ian = new Student("Ian");
        Ian.addGrade(98);
        Ian.addGrade(90);
        Ian.addGrade(86);


        students.put("J-leffew89", Jesse);
        students.put("Michelle01", Michelle);
        students.put("Aly_02", Aly);
        students.put("Ian20", Ian);

        System.out.println("Welcome!");
        System.out.println("\nHere are the Github usernames of our students:\n");


        for (String userName : students.keySet()) {
            System.out.printf("|%s| ", userName);
        }
        System.out.println("\n\nWhat Student would you like to see more information on?\n");
        System.out.println(">");
        String userInput = sc.next();
        switch (userInput) {
            case "Michelle01":
                System.out.println("Name: " + Michelle.getName() + "\n-Github UserName: " + userInput +
                        "\nCurrent Average: " + Michelle.getGradeAverage());
                break;
            case "J-leffew89":
                System.out.println("Name: " + Jesse.getName() + "\n-Github UserName: " + userInput +
                        "\nCurrent Average: " + Jesse.getGradeAverage());
                break;
            case "Aly_02":
                System.out.println("Name: " + Aly.getName() + "\n-Github UserName: " + userInput +
                        "\nCurrent Average: " + Aly.getGradeAverage());
                break;
            case "Ian20":
                System.out.println("Name: " + Ian.getName() + "\n-Github UserName: " + userInput +
                        "\nCurrent Average: " + Ian.getGradeAverage());
                keepGoing();
            default:
                System.out.printf("Sorry, No student found with the github user of %s.", userInput);
        }
    }


    public static void done() {
        System.out.println("Okay see you next time!");
    }

    public static void keepGoing() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Would you like to see another student?\n");
        String input = sc.next();
        if (input.equalsIgnoreCase("y")) {
            application();
        }else{
            done();
        }
    }

}