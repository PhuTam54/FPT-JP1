package assignment7;

import java.util.ArrayList;

public class StudentList {
    private ArrayList<Student> studentList;

    public StudentList() {
        this.studentList = new ArrayList<>();
    }

    public StudentList(ArrayList<Student> studentList) {
        this.studentList = studentList;
    }

    //1. Add student.
    public void addStudent(Student student) {
        this.studentList.add(student);
    }

    //6. Show student.
    public void showStudent() {
        for (Student student: studentList) {
            System.out.println(student.toString());
        }
    }
}
