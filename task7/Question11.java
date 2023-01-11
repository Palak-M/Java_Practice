package com.assignment.task7;
/*11.Program to find all the subarray whose sum is equal to the given number?*/

import java.util.Scanner;

public class Question11 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of values in the array: ");
        int n = sc.nextInt();

        int arr[] = new int[n];
        System.out.println("Enter the values: ");
        for(int i=0;i<n;i++){
            arr[i] = sc.nextInt();
        }

        System.out.println("Enter the target: ");
        int target = sc.nextInt();

        allSubArrays(arr,target);
    }

    static void allSubArrays(int arr[],int k){
        int st = 0;
        int sum = arr[0];

        for(int i=1;i<arr.length;i++){
            sum = sum + arr[i];
            while(sum > k && st <= i-1){
                sum = sum - arr[st];
                st++;
            }

            if(sum == k){
                System.out.println("Subarrays whose sum is equal to k is: ");
                for(int j = st;j<=i;j++){
                    System.out.print(arr[j]+" ");
                }
            }
        }
    }
}
