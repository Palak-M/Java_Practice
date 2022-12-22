package com.assignment.task4;
import java.util.*;
/*Calculate Average Using Arrays*/

public class Question2 {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("No. of elements: ");
        int n = sc.nextInt();
        int ar[] = new int[n];
        for(int i=0;i<n;i++){
            ar[i] = sc.nextInt();

        }

        int avg = 0, sum = 0;
        for(int i=0;i<n;i++){
            sum += ar[i];
        }

        avg = sum/n;
        System.out.print("Average of elements: "+avg);
    }
}
