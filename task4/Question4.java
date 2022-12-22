package com.assignment.task4;
import java.util.*;
/*Write a program to find out whether a given integer is present in an array or not.(By Binary Search)*/
/*Sorted array - Binary search*/
public class Question4 {
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
        int ans = binarySearch(arr,0,arr.length-1,target);
        if(ans == -1){
            System.out.println("Target integer is not present in the array");
        }else{
            System.out.println("Target integer is present in the array");
        }
    }

    public static int binarySearch(int arr[], int left, int right, int target){

        while(left<right){
            int mid = left + (right-left)/2;
            if(arr[mid] == target){
                return mid;
            }if(target < arr[mid]){
                return binarySearch(arr,left,mid-1,target);
            }
                return binarySearch(arr,mid+1,right,target);
            }

        return -1;
    }
}
