package com.assignment.task4;
import java.util.*;
/*Print an Array populated by user*/

public class Question1 {
    public static void main(String[] args) {
        //Approach 1
        Scanner sc= new Scanner(System.in);
        System.out.println("No. of elements: ");
        int n = sc.nextInt();
        int arr[] = new int[n];
        for(int i=0;i<n;i++){
            arr[i] = sc.nextInt();

        }
        for(int a : arr){
            System.out.print(a +" ");
    }

        //Approach 2
//        int arr[] = {4,5,6,78,9};
//        for(int a : arr){
//            System.out.print(a +" ");
  //  }
}
}
