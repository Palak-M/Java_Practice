package com.assignment.task7;
/*Find all possible combinations of String? (using recursion)*/

import java.util.Scanner;

public class Question9 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the string: ");
        String str = sc.nextLine();
        for(int i=0;i<str.length();i++)
        ss(str,"",i);

    }

    static void allCombinations(String pre,String str){
        if(str.length() == 0){
            System.out.println(pre);
        }else{
            for(int i=0;i<str.length();i++){
                allCombinations(pre+str.charAt(i), str.substring(0,i)+str.substring(i+1, str.length()));
            }
        }

    }

    static void ss(String str, String sub, int i){
        if(i >= str.length()){
            return;
        }

        String ss = sub + str.charAt(i);

        allCombinations("",ss);

        ss(str,ss,i+1);
    }
}
