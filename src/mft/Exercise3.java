package mft;

import java.util.Scanner;

public class Exercise3 {
    public static void main(String[] args) {
        double radius, area;
        String sRadius;
        final double PI = 3.14;
        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter the radius of the circle");
        sRadius = sc.nextLine();
        radius = Double.parseDouble(sRadius);
        area = PI * Math.pow(radius, 2);

        if (area < 100) {
            System.out.println("your area is " + area + "\n" + "You are getting a license");
        }
        else if (area >= 100 && area < 200) {
            System.out.println("your area is " + area + "\n" + "You will be fined");
        }
        else if (area >= 200 ) {
            System.out.println("your area is " + area + "\n" + "A license will not be issued to you");
        }
        else{
            System.out.println("there is some problem");
        }


    }
}
