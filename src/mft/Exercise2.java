package mft;

import java.util.Scanner;

public class Exercise2 {
    public static void main(String[] args) {
        double weight, height, bmi;
        String sWeight, sHeight;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your height (m))");
        sHeight = sc.nextLine();
        height = Double.parseDouble(sHeight);
        System.out.println("Enter your weight (kg))");
        sWeight = sc.nextLine();
        weight = Double.parseDouble(sWeight);

        bmi = weight / Math.pow(height, 2);
        if (bmi < 18.5) {
            System.out.println("your bmi is " + bmi + "\nYou are underweight");
        } else if (bmi >= 18.5 && bmi < 25) {
            System.out.println("your bmi is " + bmi + "\nyour weight is normal");
        } else if (bmi > 25) {
            System.out.println("your bmi is " + bmi + "\nYour weight is overweight");
        } else {
            System.out.println("there is some problem");
        }

    }
}
