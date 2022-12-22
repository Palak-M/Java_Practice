package com.assignment.task1;
import java.util.Scanner;

public class Question3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter 1st number: ");
        int first = sc.nextInt();

        System.out.print("Enter 2nd number: ");
        int second = sc.nextInt();


        //Swapping using 3rd variable
//        int third = first;
//        first = second;
//        second = third;

        //Swapping without using 3rd variable
        first = first + second; //10+20 = 30
        second = first - second; //30-20=10
        first = first - second; //30-10=20

        System.out.println("Numbers are swapped. First: "+first +" and Second:"+second);


    }
}
