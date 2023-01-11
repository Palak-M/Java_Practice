package com.assignment.task5;

/* 7.Write a JAVA method to return a boolean true if the string does not have repeating letters and consecutive or nonconsecutive
i.e. all the letters of the string be unique (isogram) else false. Write a JAVA program that reverses the words of a sentence.
For eg, => “Be Happy and Stay Motivated”
=> “eB yppah dna yatS detavitoM”

Input: Machine
Output: It is an Isogram

Input : Qyyyu
Output : It is not an Isogram
*/

import java.util.Scanner;

public class Question7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the string: ");
        String str = sc.nextLine();
        str = str.toLowerCase();
        int counter[] = new int[26];

        for(int i=0;i<str.length();i++){
            char ch = str.charAt(i);
            counter[ch-'a']++;
        }

        for(int c : counter){
            if(c > 1){
                System.out.print("It is not an Isogram");
                return;
            }
        }
        System.out.print("It is an Isogram");
    }
}