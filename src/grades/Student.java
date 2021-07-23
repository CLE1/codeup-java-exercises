package grades;

import java.util.ArrayList;

public class Student {

    private final String name;
    private final ArrayList<Integer> grade = new ArrayList<>();
    private ArrayList<Double> grades;

    public Student(String name) {
        this.name = name;

    }

    public static void main(String[] args) {

        Student student = new Student("Jesse");
        System.out.println(student.getName());

        student.addGrade(91);
        student.addGrade(84);
        student.addGrade(78);

        System.out.println(student.grade);

        double average = student.getGradeAverage();
        System.out.println(average);

    }

    // returns the student's name
    public String getName () {
        return name;
    }
    // adds the given grade to the grades property
    public void addGrade (int grade){
        this.grade.add(grade);
    }
    // returns the average of the students grades
    public double getGradeAverage () {
        double total = 0;

        for(int grades : this.grade){
            total += grades;
        }
        return total / grade.size();

    }
    public ArrayList<Double> getGrades() {
        return this.grades;
    }
}