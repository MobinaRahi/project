package mft;

import java.util.Scanner;

public class Exercise1 {
    public static void main(String[] args) {
        double weight , height,bmi;
        Scanner sc = new Scanner(System.in);
        System.out.println("please enter your weight");
        weight = sc.nextDouble();
        System.out.println("please enter your height(m)");
        height = sc.nextDouble();

        bmi = weight / Math.pow(height,2);

        System.out.println("your bmi is "+bmi);


    }
}
