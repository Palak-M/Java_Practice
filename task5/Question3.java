package com.assignment.task5;

/*Write a program to check if two strings are anagrams of each other.
* eg: input: listen, silent
* output: true*/

import java.util.Scanner;

public class Question3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter first string: ");
        String str1 = sc.nextLine();
        System.out.print("Enter second string: ");
        String str2 = sc.nextLine();

        if(str1.length() != str2.length()){
            System.out.print("false");
            return;
        }
        int counter[] = new int[26];


        for(int i=0; i<str1.length();i++){
            counter[str1.charAt(i)-'a']++;
            counter[str2.charAt(i)-'a']--;
        }

        for(int c : counter){
            if(c != 0){
                System.out.print("false");
                return;
            }
        }
        System.out.print("true");
    }
}
