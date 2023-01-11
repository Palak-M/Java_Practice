package com.assignment.task5;
import java.util.*;
/*Java Program to Check if a string contains a substring
    String txt = "This is Programiz";
    String str1 = "Programiz";
    String str2 = "Programming";

    O/P: Programiz is present in the string.
        Programming is not present in the string.
 */

public class Question6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the text: ");
        String txt = sc.nextLine();
        txt = txt.toLowerCase();
        System.out.print("Enter the first string: ");
        String str1 = sc.nextLine();
        str1 = str1.toLowerCase();
        System.out.print("Enter the second string: ");
        String str2 = sc.nextLine();
        str2 = str2.toLowerCase();

        if(txt.contains(str1)){
            System.out.println("String1 that is " +str1+ " is present in text");
        }else{
            System.out.println("String1 that is " +str1+ "is not present in text");
        }

        if(txt.contains(str2)){
            System.out.println("String2 that is " +str2+ " is present in text");
        }else{
            System.out.println("String2 that is " +str2+ " is not present in text");
        }
    }
}
