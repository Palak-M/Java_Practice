package com.assignment.task3;
import java.util.*;
/*Check Whether a Number is Prime or Not*/

public class Question4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number: ");
        int number = sc.nextInt();

        boolean flag = false;

        for(int i=2;i<=number/2;i++){
            if(number % i == 0){
                flag = true;
                break;
            }
        }

        if(!flag){
            System.out.print("It is a prime number");
        }else{
            System.out.print("It is not a prime number");
        }

    }
}

