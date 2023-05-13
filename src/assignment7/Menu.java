package assignment7;

import java.util.Scanner;

public class Menu {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        StudentList studentList = new StudentList();
        int choose;
        do {
            System.out.println("-------------MENU-------------");
            System.out.println(
                    "1. Add student.\u2028\n" +
                            "2. Edit student by id.\u2028\n" +
                            "3. Delete student by id.\u2028\n" +
                            "4. Sort student by gpa.\u2028\n" +
                            "5. Sort student by name.\u2028\n" +
                            "6. Show student.\u2028\n" +
                            "0. Exit.\n" +
                            "Enter a number (0-6)");
            choose = sc.nextInt();
            sc.nextLine();
            switch (choose) {
                case 1: //1. Add student.
                    System.out.println("Enter student's id: ");
                    String id = sc.nextLine();
                    System.out.println("Enter student's name: ");
                    String name = sc.nextLine();
                    System.out.println("Enter student's dateOfBirth: ");
                    String dateOfBirth = sc.nextLine();
                    System.out.println("Enter student's address : ");
                    String address  = sc.nextLine();
                    System.out.println("Enter student's gpa : ");
                    float gpa  = sc.nextFloat();
                    Student student = new Student(id, name, dateOfBirth, address, gpa);
                    studentList.addStudent(student);
                    System.out.println("Add student successfully!\n");
                    break;
                case 2: //2. Edit student by id.

                    break;
                case 3: //3. Delete student by id.
                    studentList.showStudent();
                    System.out.println("Enter the id of the student that you want to remove: ");
                    String studentRemoveId = sc.nextLine();
                    Student studentRemove = new Student(studentRemoveId);
                    System.out.println("Student removed: " + studentList.removeStudent(studentRemove));
                    break;
                case 4: //4. Sort student by gpa.
                    studentList.sortStudentByGPA();
                    System.out.println("Sort student by gpa successfully!\n");
                    break;
                case 5: //5. Sort student by name.
                    studentList.sortStudentByName();
                    System.out.println("Sort student by name successfully!\n");
                    break;
                case 6: //6. Show student.
                    studentList.showStudent();
                    System.out.println("Show student successfully!\n");
                    break;
                default:
                    break;
            }

        } while (choose != 0);
    }
}
