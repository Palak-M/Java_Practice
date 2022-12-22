package com.assignment.task3;
import java.util.Scanner;
/*Find Factorial of a Number, 5!= 5*4*3*2*1 = 120*/
public class Question2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number: ");
        int number = sc.nextInt();
        int factorial = 1;
        for(int i=number;i>0;i--){
            factorial *= i;
        }
        System.out.print("Factorial of " +number +" is: " +factorial);
    }
}
