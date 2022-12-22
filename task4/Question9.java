package com.assignment.task4;
import java.util.*;

/*9.Given an array of integers, return indices of the two numbers such that they add up to a specific target.
Input: nums = [1,4,10,-3], target = 14
Output: [1,2] or [2,1] # 4 + 10 = 14*/

public class Question9 {
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
        HashMap<Integer, Integer> map = new HashMap<>();
        ArrayList<Integer> ans = new ArrayList<>();
        ans.add(0);
        ans.add(1);
        for(int i=0;i<n;i++){
            int complement = target - arr[i];
            if(map.containsKey(complement)){
                ans.set(0, map.get(complement));
                ans.set(1, i);

            }
            map.put(arr[i],i);
        }
        for(int a : ans){
            System.out.print(a+" ");
        }
    }
}
