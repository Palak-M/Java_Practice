package com.assignment.task7;

/*Program to find if String has all Unique Characters?
 Input : abcd10jk
 Output : true

 Input : hutg9mnd!nk9
 Output : false
* */

import java.util.HashSet;
import java.util.Scanner;

public class Question3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the string");
        String str = sc.nextLine();


        HashSet<Character> set = new HashSet<>();
        for(int i=0;i<str.length();i++){
            set.add(str.charAt(i));
        }


        if(str.length() == set.size()){
            System.out.println("true");
        }else{
            System.out.println("false");
        }
    }
}
