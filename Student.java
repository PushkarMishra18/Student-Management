package studentrecord.model;

public class Student {
    private int rollNumber;
    private String name;
    private String course;
    private double marks;
    private String grade;

    public void setDetails(int rollNumber, String name, String course, double marks) {
        this.rollNumber = rollNumber;
        this.name = name;
        this.course = course;
        this.marks = marks;
        calculateGrade();
    }

    private void calculateGrade() {
        if (marks >= 90)
            grade = "A";
        else if (marks >= 75)
            grade = "B";
        else if (marks >= 60)
            grade = "C";
        else if (marks >= 40)
            grade = "D";
        else
            grade = "F";
    }

    public void display() {
        System.out.println("Roll Number: " + rollNumber);
        System.out.println("Name: " + name);
        System.out.println("Course: " + course);
        System.out.println("Marks: " + marks);
        System.out.println("Grade: " + grade);
        System.out.println("-----------------------------");
    }
}
