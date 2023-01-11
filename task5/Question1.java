package com.assignment.task5;
import java.util.*;
/*Write a program to reverse a string.
input-Consultadd
output-ddatlusnoC
*/

public class Question1 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();

        char ch[] = str.toCharArray();
        int left=0,right=ch.length-1;
        while(left < right){
            char t = ch[left];
            ch[left] = ch[right];
            ch[right] = t;
            left++;
            right--;
        }

        for(char s : ch)
        System.out.print(s);



    }

}
