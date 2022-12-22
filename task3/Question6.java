package com.assignment.task3;
import java.util.*;
/*Write a do-while loop that asks the user to enter two numbers. The numbers should be added and the sum
displayed. The loop should ask the user whether he or she wishes to perform the operation again. If so,
the loop should repeat; otherwise it should terminate.*/

public class Question6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int sum =0;
        char ch;
        do{
            System.out.println("Enter first number: ");
            int a = sc.nextInt();
            System.out.println("Enter second number: ");
            int b = sc.nextInt();
            sum = a+b;
            System.out.println("Sum of 2 numbers is: "+sum);
            System.out.println("Do you wish to perform the operation again? (Y/N)");
            ch = sc.next().charAt(0);
        }while(ch=='Y' || ch == 'y');
    }
}
