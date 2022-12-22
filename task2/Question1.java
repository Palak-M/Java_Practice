package com.assignment.task2;
import java.util.Scanner;

public class Question1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number: ");
        int number = sc.nextInt();
        if(number < 0){
            System.out.println("Number is negative");
        }else{
            System.out.println("Number is positive");
        }
    }
}
