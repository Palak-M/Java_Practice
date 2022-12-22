package com.assignment.task2;
import java.util.Scanner;

public class Question6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter first number: ");
        double a = sc.nextDouble();
        System.out.print("Enter second number: ");
        double b = sc.nextDouble();
        System.out.print("Operator: ");
        char op = sc.next().charAt(0);
        double ans;
        switch (op){
            case '+':
                ans = a+b;
                System.out.print("Sum of 2 numbers: "+ans);
                break;
            case '-':
                ans = a-b;
                System.out.print("Subtraction of 2 numbers: "+ans);
                break;
            case '*':
                ans = b*a;
                System.out.print("Multiplication of 2 numbers: "+ans);
                break;
            case '/':
                ans = a/b;
                System.out.print("Division of 2 numbers: "+ans);
                break;
            case '%':
                ans = a%b;
                System.out.print("Modulus of 2 numbers: "+ans);
                break;
        }
    }
}
