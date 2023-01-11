package com.assignment.task7;

/*Program to find the first non-repeated character in the String
Input: “geeksforgeeks”
Output: f
Explanation: As ‘f’ is first character in the string which does not repeat
* */

import java.util.Scanner;

public class Question1 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        int counter[] = new int[256];
        for(int i=0;i<str.length();i++){
            char ch = str.charAt(i);
            counter[ch]++;
        }
        int pos = -1;
        for(int i=0;i<str.length();i++){
            if(counter[str.charAt(i)]== 1){
                pos = i;
                break;
            }
        }
        System.out.println("First non-repeated character in the String is: "+str.charAt(pos));
    }
}
