package com.assignment.task4;
import java.util.*;
/*8.G6.
Input: arr[] = {1, 16, 2, 19, 10, 20}
Output: The third Largest element is 16*/
public class Question8 {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("No. of elements: ");
        int n = sc.nextInt();
        Integer arr[] = new Integer[n];
        System.out.println("Enter elements of an array: ");
        for(int i=0;i<n;i++){
            arr[i] = sc.nextInt();
        }

        //Approach1: USing Collections.reverseOrder()
//        Arrays.sort(arr, Collections.reverseOrder());
//        System.out.println("The third largest element is: "+arr[2]);

        //Approach 2:
        int first = arr[0];
        int second = Integer.MIN_VALUE, third = Integer.MIN_VALUE;
        for(int i=1;i<n;i++){
            if(arr[i] > first){
                third = second;
                second = first;
                first = arr[i];
            }else if(arr[i] > second){
                third = second;
                second = arr[i];
            }else if(arr[i] > third){
                third = arr[i];
            }
        }
        System.out.println("The third largest element is: "+third);

    }
}
