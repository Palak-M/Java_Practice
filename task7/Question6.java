package com.assignment.task7;

/*Program to Count occurrences of each character in a string in java?*/

import java.util.Scanner;

public class Question6 {
    public static void main(String[] args) {
        String str;
        int i;
        int counter[] = new int[256];
        Scanner ob = new Scanner(System.in);
        System.out.print("Please enter a string: ");
        str = ob.nextLine();
        for (i = 0; i < str.length(); i++)
        {counter[str.charAt(i)]++;}
        for (i = 0; i < 256; i++)
        {if (counter[i] != 0)
        {
            System.out.println("Count of "+(char) i + " is " + counter[i]);
        }
        }
    }
}
