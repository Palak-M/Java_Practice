package com.assignment.task2;
import java.util.Scanner;

public class Question7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while(true) {
            System.out.print("Enter number:");
            int number = sc.nextInt();
            if (number < 0) {
                break;
            } else {
                System.out.println("Keep going");
                continue;
            }

        }
        System.out.println("Its over");

    }
}
