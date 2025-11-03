package studentrecord.service;

import java.util.Scanner;
import studentrecord.model.Student;

public class StudentService {
    private Student[] students;
    private int count;

    public StudentService(int size) {
        students = new Student[size];
        count = 0;
    }

    public void addStudent() {
        if (count == students.length) {
            System.out.println("No more records can be added.");
            return;
        }

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Roll Number: ");
        int roll = sc.nextInt();
        sc.nextLine();
        System.out.print("Enter Name: ");
        String name = sc.nextLine();
        System.out.print("Enter Course: ");
        String course = sc.nextLine();
        System.out.print("Enter Marks: ");
        double marks = sc.nextDouble();

        students[count] = new Student();
        students[count].setDetails(roll, name, course, marks);
        count++;
    }

    public void displayAll() {
        if (count == 0) {
            System.out.println("No records found.");
        } else {
            for (int i = 0; i < count; i++) {
                students[i].display();
            }
        }
    }
}
