package com.assignment.task6;

/*Write a program to print the area and perimeter of a triangle having sides of 3, 4 and 5 units by creating a class
named 'Triangle' without any parameter in its constructor.*/

public class Question2 {
     static class Triangle{
        int side1;
        int base;
        int side2;

        public double area(){
            double s = (side1 + base + side2)/2;
            return (double)Math.sqrt(s*(s-side1)*(s-base)*(s-side2));
        }

         public double perimeter(){
            return (side1+base+side2);
         }

    }

    public static void main(String[] args) {
        Triangle ob = new Triangle();
        ob.side1 = 3;
        ob.base = 4;
        ob.side2 = 5;
        System.out.println("Area of triangle: " +ob.area());
        System.out.println("Perimeter of triangle: " +ob.perimeter());
    }
}
