package com.assignment.task2;
import java.util.Scanner;
/* 9.Write a program to input electricity unit charges and calculate total electricity bill according to the given
condition:
For first 60 units Rs. 0.30/unit
For next 90 units Rs. 0.75/unit
For next 120 units Rs. 1.10/unit
For unit above 300 Rs. 2.50/unit
An additional surcharge of 20% is added to the bill*/
public class Question9 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter electricity unit charge: ");
        int unit = sc.nextInt();

        double bill, total_bill, surcharge;
        if(unit <= 60){
            bill = unit*0.30;
        }else if(unit <= 150){
            bill = (60*0.30) + (unit-60)*0.75;
        }else if(unit <= 270){
            bill = (60*0.30) + (150*0.75) + (unit-150)*1.1;
        }else{
            bill = (60*0.30) + (150*0.75) + (270*1.1) + (unit-270)*2.5;
        }
    surcharge = bill*0.20;
        total_bill = bill + surcharge;

        System.out.println("Total bill is: "+total_bill);
    }
}
