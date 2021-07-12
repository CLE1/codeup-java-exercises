package grades;

import util.Input;

import java.util.HashMap;
import java.util.Locale;
import java.util.Scanner;

public class GradesApplication {
    public static void main(String[] args) {

        HashMap<String, String> students = new HashMap<>();

        students.put("Chris", "CLE1");
        students.put("Tiffany", "Finky");
        students.put("Corey", "Breezy");
        students.put("Erik", "Thisguy");

        System.out.println(students);

        Student student1 = new Student("Chris");
        student1.addGrade(100);
        student1.addGrade(80);
        student1.addGrade(60);

        Student student2 = new Student("Tiffany");
        student2.addGrade(100);
        student2.addGrade(80);
        student2.addGrade(60);

        Student student3 = new Student("Corey");
        student3.addGrade(100);
        student3.addGrade(80);
        student3.addGrade(60);

        Student student4 = new Student("Erik");
        student4.addGrade(100);
        student4.addGrade(80);
        student4.addGrade(60);

        Application();
    }

    public static void Application(){
        HashMap<String, Student> students = new HashMap<>();
        students.put("CLE1", new Student("Chris", 100,80,60));
        students.put("Finky", new Student("Tiffany", 100,80,60));
        students.put("Breezy", new Student("Corey", 100,80,60));
        students.put("Thisguy", new Student("Erik", 100,80,60));


        Input input = new Input();
        System.out.println("welcome!");
        do {
            System.out.print("\n");
            for (String key : students.keySet()) {
                System.out.print("|" + key + "| ");
            }
            System.out.println("What student would you like to see more information on?");
            System.out.println("> ");
            String userInput = input.getString();

            Student userName = students.get(userInput);

            if (userName == null) {
                System.out.println("Sorry, no student found with the GitHub username of " + userInput + ",");
            } else {
                System.out.printf("\n Name: %s - GitHub Username: %s\n", userName.getName(), userInput);
                System.out.printf("\n Current Average: %s \n", userName.getName(), userInput);
            }
        } while (input.yesNo());


    }
}
