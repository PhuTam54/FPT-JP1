package assignment7;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class StudentList {
    private final ArrayList<Student> studentList;

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

    //2. Edit student by id.
    public void editStudentById(String id, Student studentOld, Student studentNew) {
        for (Student student: studentList) {
            if (student.getId().contains(id)) {
                studentList.remove(studentOld);
                studentList.add(studentNew);
            }
        }
    }

    //3. Delete student by id.
    public boolean removeStudent(Student student) {
        return this.studentList.remove(student);
    }

    //4. Sort student by gpa.
    public void sortStudentByGPA() {
        Collections.sort(this.studentList, new Comparator<Student>() {
            @Override
            public int compare(Student student1, Student student2) {
                if (student1.getGpa() < student2.getGpa()) {
                    return -1;
                }else if (student1.getGpa() > student2.getGpa()) {
                    return 1;
                } else {
                    return 0;
                }
            }
        });
    }

    //5. Sort student by name.
    public void sortStudentByName() {
        Collections.sort(this.studentList, new Comparator<Student>() {
            @Override
            public int compare(Student student1, Student student2) {
                if (student1.getName().compareTo(student2.getName()) < 0) {
                    return -1;
                }else if (student1.getName().compareTo(student2.getName()) > 0) {
                    return 1;
                } else {
                    return 0;
                }
            }
        });
    }

    //6. Show student.
    public void showStudent() {
        for (Student student: studentList) {
            System.out.println(student);
        }
    }

    // kiem tra ton tai
    public boolean isValid(Student student) {
        return this.studentList.contains(student);
    }
}
