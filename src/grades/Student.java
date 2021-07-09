package grades;

import java.util.ArrayList;

public class Student {

    private String name;
    private ArrayList<Integer> grade;

    public Student(String name, ArrayList<Integer> grade) {
        this.name = name;
        this.grade = grade;
    }

    public Student() {

    }

    public static void main(String[] args) {

        Student student = new Student();



        System.out.println();

    }

    // returns the student's name
    public String getName(){
        return this.name;
    }
    // adds the given grade to the grades property
    public void addGrade(int grade){

        this.grade.add(grade);

    }
    // returns the average of the students grades
    public double getGradeAverage(){

        double sum = 0;

        for (int i = 0; i < grade.size(); i++) {
            sum = sum + grade.get(i);
        }

        return sum / grade.size();
    }

}