package self.practice;

import java.util.Scanner;

public class Exercise3 {
    public static void main(String[] args) {
        //تعریف متغیرها
        String numStr1, numStr2, Operator;
        int num1, num2, result;

        //دریافت ورودی از کاربر
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the first number");
        numStr1 = sc.nextLine();
        System.out.println("Enter the second number");
        numStr2 = sc.nextLine();
        System.out.println("Enter the operator");
        Operator = sc.nextLine();

        //تبدیل ورودی ها به عدد صحیح

        num1 = Integer.parseInt(numStr1);
        num2 = Integer.parseInt(numStr2);

        //  تعریف شرط و خروجی
        switch (Operator) {
            case "+":
                result = num1 + num2;
                System.out.printf("%d + %d = %d%n", num1, num2, result);
                break;
            case "-":
                result = num1 - num2;
                System.out.printf("%d - %d = %d%n", num1, num2, result);
                break;
            case "*":
                result = num1 * num2;
                System.out.printf("%d * %d = %d%n", num1, num2, result);
                break;
            case "/":
                result = num1 / num2;
                System.out.printf("%d / %d = %d%n", num1, num2, result);
                break;

        }


    }
}