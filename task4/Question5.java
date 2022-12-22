package com.assignment.task4;
import java.util.*;
/*Write a Java program to add two matrices of the same size.*/
public class Question5 {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.print("No. of rows: ");
        int row = sc.nextInt();
        System.out.print("No. of cols: ");
        int col = sc.nextInt();

        int arr1[][] = new int[row][col];
        System.out.println("Enter elements of arr1: ");
        for(int i=0;i<arr1.length;i++){
            for(int j= 0;j<arr1[i].length;j++){
                arr1[i][j] = sc.nextInt();
            }
        }

        int arr2[][] = new int[row][col];
        System.out.println("Enter elements of arr2: ");
        for(int i=0;i<arr2.length;i++){
            for(int j= 0;j<arr2[i].length;j++){
                arr2[i][j] = sc.nextInt();
            }
        }

        int sum[][] = new int[row][col];
        for(int i=0;i<arr1.length;i++){
            for(int j= 0;j<arr1[i].length;j++){
                sum[i][j] = arr1[i][j] + arr2[i][j];
            }
        }

        System.out.println("Sum of 2 arrays: ");
        for(int r[] : sum){
            for(int c : r){
                System.out.print(c +" ");
            }
            System.out.println();
        }
    }
}
