package com.assignment.task6;
/*Create a class named 'Student' with String variable 'name' and integer variable 'EnrollmentNo'. Assign the value of
EnrollmentNo as '132' and that of name as "Amay" by creating an object of the class Student, And Print the details of
Amay.*/

public class Question1 {
    static class Student{
        String name;
        int EnrollmentNo;
    }

    public static void main(String[] args) {
    Student ob = new Student();
    ob.name = "Amay";
    System.out.println("Student's name: "+ob.name);
    ob.EnrollmentNo = 132;
    System.out.println("Student's enrollment no.: "+ob.EnrollmentNo);
    }
}
