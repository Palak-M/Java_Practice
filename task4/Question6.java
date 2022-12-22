package com.assignment.task4;
import java.util.*;
/*Write a Java program to find the sum of the two elements (and print the number) of a given array which is equal to a given integer.
a. Sample array: [1,2,4,5,6]
b. Target value: 6*/

public class Question6 {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("No. of elements: ");
        int n = sc.nextInt();
        int arr[] = new int[n];
        System.out.println("Enter elements of an array: ");
        for(int i=0;i<n;i++){
            arr[i] = sc.nextInt();
        }
        System.out.println("Enter target: ");
        int target = sc.nextInt();

        //Approach1
        for(int i=0;i<n;i++){
            for(int j=i+1;j<n;j++){
                if(arr[i] + arr[j] == target){
                    System.out.println(arr[i] +"," + arr[j]);
                }
            }
        }
        //Approach2
//        Arrays.sort(arr);
//        Question6 ob = new Question6();
//        ob.findElements(arr, target);
    }
//    public void findElements(int arr[], int target){
//        int left=0, right = arr.length-1;
//        while(left<right){
//            if(arr[left] + arr[right] == target){
//                System.out.println(arr[left] +"," + arr[right]);
//            }
//            if(arr[left] + arr[right] > target){
//                right--;
//            }else{
//                left++;
//            }
//        }
//    }
}
