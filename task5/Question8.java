package com.assignment.task5;
/*8.Write a JAVA program that gives boolean values; true, if the string has balanced braces and false,
if the string has unbalanced braces:
For eg, => “({{)}[}]()” //output => true //valid parenthesis
            {{( [ ) ] }} => “[})(” //output => false //invalid parenthesis
*/


import java.util.HashMap;
import java.util.Scanner;
import java.util.Stack;

public class Question8 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the string: ");
        String str = sc.nextLine();
        HashMap<Character, Character> map = new HashMap<>();
        map.put(')','(');
        map.put(']','[');
        map.put('}','{');

        Stack<Character> st = new Stack<>();
        for(int i=0;i<str.length();i++){
            char ch = str.charAt(i);
            if(map.containsKey(ch)){
                if(st.empty() || st.pop() != map.get(ch)){
                    System.out.print("Invalid Parenthesis");
                    return;
                }
            }
            else{
                st.push(ch);
            }
        }
        if(st.empty())
        System.out.print("Valid Parenthesis");
    }
}
