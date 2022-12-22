package com.assignment.task1;
import java.util.Scanner;

public class Question4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter 1st number: ");
        int first = sc.nextInt();

        System.out.print("Enter 2nd number: ");
        int second = sc.nextInt();

        int sum = first + second;
        System.out.println("The sum of 2 numbers is: "+sum);
    }
}
