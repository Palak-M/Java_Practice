package com.assignment.task7;

/*Program to Count the number of words in the String?
* Input: assignments of java
* Output: 3
* */

import java.util.Scanner;

public class Question4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the string: ");
        String str = sc.nextLine();
        int count = 1;

        for(int i=0;i<str.length();i++){
            if((str.charAt(i)==' ') && (str.charAt(i+1) != ' ')){
                count++;
            }
        }
        System.out.println("No. of words in the string: "+count);
    }
}
