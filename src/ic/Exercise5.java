package ic;

import java.util.ArrayList;
import java.util.Scanner;

public class Exercise5 {
    public static void main(String[] args) {
        int choice;
        ArrayList<Lesson> lessons = new ArrayList<Lesson>();
        Scanner input = new Scanner(System.in);
        while (true) {
            System.out.println(" 1 ) add lesson ");
            System.out.println(" 2 ) Find lesson by teacher");
            System.out.println(" 3 ) sum of lessons coef ");
            System.out.println(" 4 ) show list ");
            System.out.println(" 5 ) exit ");

            System.out.println("please Enter your choice : ");
            choice = Integer.parseInt(input.nextLine());
            System.out.println("-----------------------------------");


            if (choice == 1) {
                Lesson lesson = new Lesson();
                System.out.print("please Enter lisson id ");
                lesson.id = Integer.parseInt(input.nextLine());
                System.out.print("please Enter lisson title ");
                lesson.title = input.nextLine();
                System.out.print("please Enter lisson coef ");
                lesson.coef = Integer.parseInt(input.nextLine());
                System.out.print("please Enter lisson teacher ");
                lesson.teacher = input.nextLine();
                lessons.add(lesson);
                System.out.println("lessons added successfully");
                System.out.println("-----------------------------------");

            } else if (choice == 2) {
                System.out.println("under cunstruction ...! ");
                System.out.println("--------------------------------");
            } else if (choice == 3) {
                System.out.println("under cunstruction ...!  ");
                System.out.println("--------------------------------");
            } else if (choice == 4) {
                if (lessons.isEmpty()) {
                    System.out.println("your list is empty.");
                    System.out.println("--------------------------------");
                } else {
                    System.out.println("your list is : ");
                    for (Lesson lesson : lessons) {
                        System.out.printf("your id = %-5d , and your title : %-10s , and your coef = %-4d , and your teacher name is : %-10s %n", lesson.id, lesson.title, lesson.coef, lesson.teacher);
                        System.out.println("--------------------------------");
                    }
                }
            } else if (choice == 5) {
                break;
            } else {
                System.out.println("please enter the correct choice");
            }

        }
    }
}
