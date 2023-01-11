package com.assignment.task5;
import java.util.*;
/*Write a program to count a number of vowels and consonants in a String.
* String: "Vowels"
* No. of vowels = 2
* No. of consonants = 4
* */

//Vowels - a,e,i,o,u
public class Question5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the string: ");
        String str = sc.nextLine();
        str = str.toLowerCase();
        int vowels_count =0, consonants_count=0;
        for(int i=0;i<str.length();i++){
            if(str.charAt(i)=='a' || str.charAt(i)=='e' || str.charAt(i)=='i' ||str.charAt(i)=='o'||str.charAt(i)=='u'){
                vowels_count++;
            }else{
                consonants_count++;
            }
        }
        System.out.println("Number of vowels: "+vowels_count);
        System.out.print("Number of consonants: "+consonants_count);

    }
}
