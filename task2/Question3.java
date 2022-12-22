package com.assignment.task2;
import java.util.Scanner;

public class Question3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter first number: ");
        int first = sc.nextInt();
        System.out.print("Enter second number: ");
        int second = sc.nextInt();

        int quotient = first / second;
        System.out.println("The quotient is: "+quotient);

        int remainder = first % second;
        System.out.println("The remainder is: "+remainder);
    }
}
