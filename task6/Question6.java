package com.assignment.task6;

/*6.Print the sum, difference, and product of two complex numbers by creating a class named 'Complex' with separate
methods for each operation whose real and imaginary parts are entered by the user.*/
public class Question6 {
    static class Complex{
        int real;
        int imaginary;
        Complex(){

        }
        Complex(int real, int imaginary){
            this.real = real;
            this.imaginary = imaginary;
        }
        Complex sum(Complex num1, Complex num2){
            return new Complex((num1.real + num2.real),(num1.imaginary + num2.imaginary));
        }
        Complex diff(Complex num1, Complex num2){
            return new Complex((num1.real - num2.real),(num1.imaginary - num2.imaginary));
        }
        Complex product(Complex num1, Complex num2){
            return new Complex(((num1.real*num2.real)-(num1.imaginary*num2.imaginary)),((num1.real*num2.imaginary)+(num1.imaginary*num2.real)));
        }
        void displayComplexNum(){
            System.out.println("Complex Number: "+real+" + "+imaginary+"i");
        }

    }
    public static void main(String[] args) {
        Complex c1 = new Complex(4,2);
        c1.displayComplexNum();
        Complex c2 = new Complex(5,2);
        c2.displayComplexNum();
        Complex c3 = new Complex();
        c3 = c3.sum(c1,c2);
        System.out.println("Sum: ");
        c3.displayComplexNum();

        c3 = c3.diff(c1,c2);
        System.out.println("Diff: ");
        c3.displayComplexNum();

        c3 = c3.product(c1,c2);
        System.out.println("Product: ");
        c3.displayComplexNum();
    }
}
