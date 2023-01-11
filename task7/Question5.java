package com.assignment.task7;

/*Program to check the Armstrong number?
* 153: 1^3 + 5^3 + 3^3 = 1 + 125+ 27 = 153 (Armstrong Number)
* 125: 1^3 + 2^3 + 5^3 = 1 + 8 + 125 = 134 (Not an Armstrong Number)
* */

import java.util.Scanner;

public class Question5 {
    public static void main(String[] args) {

        Scanner ob = new Scanner(System.in);
        System.out.print("Please enter number: ");
        int num = ob.nextInt();
        int n1, count =0;
        int lastNum = 0;
        int sum = 0;
        n1 = num;
        while(n1 > 0){
            n1 = n1/10;
            count++;
        }
        n1 = num;

        while(n1 > 0){
            lastNum = n1 % 10;
            sum += (Math.pow(lastNum, count));
            n1 = n1/10;
        }

        if(num == sum){
            System.out.println("It is an Armstrong number");
        }else{
            System.out.println("It is not an Armstrong number");
        }
    }
}