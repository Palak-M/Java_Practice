package com.assignment.task6;

/*5.Create a class named 'Rectangle' with two data members-length and breadth and a method to calculate the
area which is 'length*breadth'. The class has three constructors which are :
1.having no parameter - values of both length and breadth are assigned zero.
2.having two numbers as parameters - the two numbers are assigned as length and breadth respectively.
3.having one number as a parameter - both length and breadth are assigned that number.
Now, create objects of the 'Rectangle' class having none, one, and two parameters and print their areas.
*/

public class Question5 {
    static class Rectangle{
        int length, breadth;
        public double area(){
            return length*breadth;
        }
        Rectangle(){
            length = breadth = 0;
        }
        Rectangle(int length, int breadth){
            this.length = length;
            this.breadth = breadth;
        }
        Rectangle(int num){
            this.length = this.breadth = num;
        }

    }
    public static void main(String[] args) {
        Rectangle ob = new Rectangle();
        System.out.println("Area of rectangle with no parameters: "+ob.area());
        Rectangle ob1 = new Rectangle(2,4);
        System.out.println("Area of rectangle with two parameters: "+ob1.area());
        Rectangle ob2 = new Rectangle(4);
        System.out.println("Area of rectangle with one parameters: "+ob2.area());
    }
}
