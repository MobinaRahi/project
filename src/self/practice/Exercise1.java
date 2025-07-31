package self.practice;

import java.util.Scanner;

public class Exercise1 {
    public static void main(String[] args) {
        //تعریف متغیرها
        String name, sCore;
        int core;
        //گرفتن ورودی از مخاطب  ومقدار دهی متغیر ها
        System.out.println("Please enter your name : ");
        Scanner sc = new Scanner(System.in);
        name = sc.nextLine();
        System.out.println("Please enter your Core : ");
        sCore = sc.nextLine();
        core = Integer.parseInt(sCore);
        //تعریف شرط

        if (core < 10) {
            System.out.printf("%s your Core is less than 10!\n so you fail", name);
        } else if (core >= 10 && core < 15) {
            System.out.printf("%s your Core is between 10 and 15 !\n so you are not bad", name);
        } else if (core >= 15 && core < 18) {
            System.out.printf("%s your Core is between 15 and 18 !\n so you are good", name);
        } else if (core >= 18 && core <= 20) {
            System.out.printf("%s your Core is between 18 and 20 !\n so you are very good", name);
        } else {
            System.out.println("something went wrong");
        }
    }


}
