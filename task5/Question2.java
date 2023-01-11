package com.assignment.task5;
import java.util.*;
import java.io.*;

/*Write a program to reverse a string in such way
input-Consultadd Pvt
Output-ddatlusnoC tvP*/
public class Question2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter string: ");
        String str = sc.nextLine();

        StringBuilder sb = new StringBuilder(str);
        str = sb.reverse().toString();
        System.out.println("Reversed str: " + str);
        String arr[] = str.split(" ");
//        for(String a : arr)
//        System.out.println(" str: " + a);
        StringBuilder ss = new StringBuilder();
        for(int i=arr.length-1;i>=0;i--){
            ss.append(arr[i]).append(" ");
        }
        System.out.print("Desired Output: " +ss.toString());
    }
}
