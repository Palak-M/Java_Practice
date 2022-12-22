package com.assignment.task3;
import java.util.*;
/*Write a program to sum first n even numbers using a while loop.*/


public class Question5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number: ");
        int number = sc.nextInt();
        int sum = 0;

        int curr = 2, i=1;
        while (i <= number) {
            sum += curr;
            curr += 2;
            i++;
        }

        System.out.print("Sum of even numbers: " + sum);
    }

}