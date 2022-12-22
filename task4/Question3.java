package com.assignment.task4;
import java.util.*;
/*Write a program to find out whether a given integer is present in an array or not.(By Linear Search)*/
public class Question3 {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("No. of elements: ");
        int n = sc.nextInt();
        System.out.println("Target integer to find: ");
        int target = sc.nextInt();
        int arr[] = new int[n];
        System.out.println("Array elements: ");
        for(int i=0;i<n;i++){
            arr[i] = sc.nextInt();
        }
        for(int i=0;i<n;i++){
            if(arr[i] == target){
                System.out.println("Target integer is present in the array");
                break;
            }
        }
        System.out.println("Target integer is not present in the array");
    }
}
