package com.assignment.task3;
import java.util.*;

/*Print the following pattern
     *
    **
   ***
  ****
 *****
  */
public class Question7 {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter number: ");
        int n = sc.nextInt();
        int spaces = n-1, stars = 1;

        for(int i=1;i<=n;i++){
            for(int j=1;j<=spaces;j++){
                System.out.print(" ");
            }
            for(int j=1;j<=stars;j++){
                System.out.print("*");
            }
            spaces--;
            stars++;
            System.out.println();
        }

    }
}
