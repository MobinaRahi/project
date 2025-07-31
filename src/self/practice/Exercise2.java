package self.practice;

import java.util.Scanner;

public class Exercise2 {
    public static void main(String[] args) {
        //تعریف متغیرها
        String numStr1,numStr2;
        int num1,num2,i;

        // گرفتن ورودی از کاربر
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the first number");
        numStr1 = sc.nextLine();
        System.out.println("enter the second number");

        numStr2 = sc.nextLine();

        //تبدیل ورودی های کاربر از حالت string  به حالت int
        num1=Integer.parseInt(numStr1);
        num2=Integer.parseInt(numStr2);

        //  ساخت حلقه و یافتن اعداد زوج و نمایش اعداد زوج
        for (i=num1;i<=num2;i++){
            if(i%2==0){
                System.out.printf("%d ",i);
            }
        }
    }
}