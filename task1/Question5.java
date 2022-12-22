package com.assignment.task1;
import java.util.Scanner;

public class Question5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter radius: ");
        int radius = sc.nextInt();
        double area = Math.PI * radius * radius;
        System.out.print("Area of the circle is: " + area);
    }
}
