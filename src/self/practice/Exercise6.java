package self.practice;


import java.util.ArrayList;
import java.util.Scanner;

public class Exercise6 {
    public static void main(String[] args) {
        ArrayList<Student> students = new ArrayList<>();
        Scanner input = new Scanner(System.in);
        int choice, id;
        while (true) {
            System.out.println("1 ) add student");
            System.out.println("2 ) show students");
            System.out.println("3) find student by id");
            System.out.println("4) max  Grade Point Average");
            System.out.println("5) delete student by id");
            System.out.println("6) Exit");

            System.out.println("Enter your choice : ");
            System.out.println("-----------------------------");
            choice = Integer.parseInt(input.nextLine());

            if (choice == 1) {
                Student student = new Student();
                System.out.println("Enter student id : ");
                student.id = Integer.parseInt(input.nextLine());
                System.out.println("Enter student name : ");
                student.name = input.nextLine();
                System.out.println("Enter student gpa : ");
                student.gpa = Double.parseDouble(input.nextLine());
                students.add(student);
                System.out.println("add student successfully");
                System.out.println("-----------------------------");
            } else if (choice == 2) {
                if (students.isEmpty()) {
                    System.out.println("There is no students in the list");
                    System.out.println("-----------------------------");
                } else {
                    for (Student student : students) {
                        System.out.printf("your Students Id : %-4d , your Students name : %-10s , yor Students GPA is %-5.2f\n", student.id, student.name, student.gpa);
                        System.out.println("-----------------------------");
                    }
                }
            } else if (choice == 3) {
                if (students.isEmpty()) {
                    System.out.println("There is no students in the list");
                } else {
                    System.out.println("Enter student id : ");
                    id = Integer.parseInt(input.nextLine());
                    for (Student student : students) {
                        if (student.id == id) {
                            System.out.printf("your Students Id : %-4d , your Students name : %-10s , yor Students GPA is %-5.2f\n", student.id, student.name, student.gpa);
                            System.out.println("-----------------------------");
                        } else {
                            System.out.printf("we dont have any Student with Id=%2d %n", id);
                            System.out.println("-----------------------------");
                        }
                    }

                }
            } else if (choice == 4) {
                if (students.isEmpty()) {
                    System.out.println("There is no students in the list");
                }
            } else if (choice == 4) {
                if (students.isEmpty()) {
                    System.out.println("There is no students in the list");
                } else {
                    double maxGpa = -1;
                    Student topStudent = null;
                    for (Student student : students) {
                        if (student.gpa > maxGpa) {
                            maxGpa = student.gpa;
                            topStudent = student;
                        }
                    }
                    System.out.printf("Top student is: ID = %d, Name = %s, GPA = %.2f\n",
                            topStudent.id, topStudent.name, topStudent.gpa);
                    System.out.println("-----------------------------");
                }
            } else if (choice == 5) {
                if (students.isEmpty()) {
                    System.out.println("There is no students in the list");
                } else {
                    System.out.println("Enter student id : ");
                    id = Integer.parseInt(input.nextLine());
                    for (int i = 0; i < students.size(); i++) {

                        if (students.get(i).id == id) {
                            students.remove(students.get(i));
                            System.out.println("remove student successfully");
                        } else {
                            System.out.printf("we dont have any Student with Id=%2d %n", id);
                            System.out.println("-----------------------------");
                        }
                    }
                }
            } else if (choice == 6) {
                break;
            }

        }
    }
}
