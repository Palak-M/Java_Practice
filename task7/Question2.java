package com.assignment.task7;
/*Program to find the intersection of two arrays in java?*/

public class Question2 {
    public static void main(String[] args) {
    int arr1[] = {10,20,59,33,90};
    int arr2[] = {90,59,66,77,33};

    System.out.println("Intersection of 2 arrays: ");
    for(int i=0;i<arr1.length;i++){
        for(int j=0;j<arr2.length;j++){
            if(arr1[i] == arr2[j]){
                System.out.println(arr1[i]);
            }
        }
    }
    }
}
