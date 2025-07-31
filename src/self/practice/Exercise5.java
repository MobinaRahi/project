package self.practice;

import java.util.Scanner;

public class Exercise5 {

    public static void main(String[] args) {
        // تعریف متغیر ها
        String numStr;
        int number, count = 0;

        // گرفتن ورودی از کاربر
        System.out.println("please inter a number");
        Scanner sc = new Scanner(System.in);
        numStr = sc.nextLine();

        // تبدیل به عدد صحیح
        number = Integer.parseInt(numStr);

        // ایجاد حلقه و شماردن شمارنده ها توسط  count
        for (int i = 2; i < number; i++) {
            if (number % i == 0) {
                count++;
            }
        }
        // تعریف شرط برای چک کردن اول بودن عدد

        if (count == 0) {
            System.out.println("your number is prim");
        } else {
            System.out.println("your number is not prim");
        }
    }

}
