package com.assignment.task5;

import java.util.HashMap;
import java.util.Scanner;
/*Write a program to count the occurrence of a given character in a
string.
Input : str = "abccdefgaa"
          c = 'a'
Output : 3
*/

public class Question4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter string: ");
        String str = sc.nextLine();
        System.out.print("Enter character: ");
        char c = sc.next().charAt(0);
        HashMap<Character, Integer> map = new HashMap<>();
        char ch_str[] = str.toCharArray();
        for(char i : ch_str){
            if(map.containsKey(i)){
                map.put(i, map.get(i)+1);
            }else{
                map.put(i, 1);
            }

        }
        System.out.println(map);

        if(map.containsKey(c)){
            System.out.print("Occurrence of character: " + map.get(c));
        }

    }
}
