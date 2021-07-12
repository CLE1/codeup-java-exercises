package grades;

import java.util.ArrayList;

public class Student {

    private String name;
    private ArrayList<Integer> grades = new ArrayList<>();
    private ArrayList<Integer> grade = new ArrayList<>();

    public Student(String name, int ...grades) {

        setName(name);
        addGrades(grades);
    }



    public static void main(String[] args) {

        Student student = new Student("Chris");


        System.out.println(student.getName());

        student.addGrade(97);
        student.addGrade(94);
        student.addGrade(88);
        System.out.println(student.grade);

        double average = student.getGradeAverage();
        System.out.println(average);

    }

    // returns the student's name
    public String getName(){
        return this.name;
    }

    // adds the given grade to the grades property
    public void addGrade(int grade){

        this.grade.add(grade);

    }

    public void addGrades(int ...grades){
        for (int grade: grades){
            this.addGrade(grade);
        }
    }

    // returns the average of the students grades
    public double getGradeAverage(){

        double sum = 0;

        for (int i = 0; i < grade.size(); i++) {
            sum = sum + grade.get(i);
        }

        return sum / grade.size();
    }

    public void setName(String name) {
        this.name = name;
    }

    public ArrayList<Integer> getGrades() {
        return grades;
    }

    public void setGrades(ArrayList<Integer> grades) {
        this.grades = grades;
    }

    public ArrayList<Integer> getGrade() {
        return grade;
    }

    public void setGrade(ArrayList<Integer> grade) {
        this.grade = grade;
    }
}