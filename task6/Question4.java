package com.assignment.task6;
/*4.Write a program to print the names of students by creating a Student class. If no name is passed while creating
an object of Student class, then the name should be "Unknown", otherwise the name should be equal to the String value
passed while creating an object of Student class. (Hint: Overloading concept)*/
public class Question4 {
    static class Student{
        String empName;
        Student(){
            empName = "Unknown";
        }
        Student(String name){
            empName = name;
        }

        public String toString(){
            return empName;
        }
    }
    public static void main(String[] args) {

        Student ob = new Student();
        Student ob1 = new Student("Palak");
        System.out.println(ob);
        System.out.println(ob1);
    }
}
