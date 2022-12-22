package com.assignment.task3;
import java.util.Scanner;
/*Display Fibonacci series: 0 1 1 2 3 5 8 13 21 34 55*/
public class Question1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number: ");
        int number = sc.nextInt();
        System.out.print("Fibonacci series upto " +number +" is: ");
        int first = 0;
        int second = 1;
        for(int i=1;i<=number;i++){
            System.out.print(first +" ");
            int third = first + second;
            first = second;
            second = third;
        }

    }
}
