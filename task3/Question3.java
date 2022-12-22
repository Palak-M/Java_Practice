package com.assignment.task3;
import java.util.*;
/*Check Palindrome: 3553, RADAR*/

public class Question3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        //1. To check String as Palindrome
        System.out.print("Enter string: ");
        String str = sc.nextLine();
        str = str.toLowerCase();
        int left = 0, right = str.length()-1;

        while(left < right){
            if(str.charAt(left) != str.charAt(right)){
                System.out.println("Not a palindrome");
                break;
            }
            left++;
            right--;
        }

        System.out.println("It is palindrome");

        //2. To check number as palindrome
        System.out.print("Enter number: ");
        int number = sc.nextInt();

        int rem, sum =0;
        int temp = number;

        while(number > 0){
            rem = number%10;
            sum = (sum*10) + rem;
            number = number/10;
        }

        if(temp == sum){
            System.out.println("It is palindrome");
        }else{
            System.out.println("It is not a palindrome");
        }

    }



}
