package com.assignment.task2;
import java.util.Scanner;

public class Question4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter year: ");
        int year = sc.nextInt();
        boolean leap = false;

        if (year % 4 == 0) {
            if (year % 100 == 0) {
                if (year % 400 == 0) {
                    leap = true;
                } else {
                    leap = false;
                }
            }
            else {
                leap = true;
            }
        }else{
            leap = false;
        }

        if (leap) {
            System.out.print("It is a leap year.");
        } else {
            System.out.print("It is not a leap year.");
        }
    }
}