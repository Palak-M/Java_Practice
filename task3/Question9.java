package com.assignment.task3;
import java.util.*;
/* 9.Print the following pattern

     *
    * *
   *   *
  *     *
 *       *
  *     *
   *   *
    * *
     *
*/
public class Question9 {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter number: ");
        int n = sc.nextInt();
        int outerSpace = n/2;
        int innerSpace = -1;
        for(int i=1;i<=n;i++){
            for(int j=1;j<=outerSpace;j++){
                System.out.print(" ");
            }
            System.out.print("*");
            for(int j =1;j<=innerSpace;j++){
                System.out.print(" ");
            }
            if(i>1 && i<n){
                System.out.print("*");
            }
            if(i<=n/2){
                outerSpace--;
                innerSpace += 2;
            }else{
                outerSpace++;
                innerSpace -= 2;
            }
            System.out.println();
    }

    }
}
