package com.assignment.task6;

/*3.Write a program that would print the information (name, year of joining, salary, address) of three employees by
creating a class named 'Employee'. The output should be as follows:
Name        Year of Joining     Address
Robert          1994            64C- Walls Street
Sam             2000            68D- Walls Street
John            1999            26B- Walls Street
*/

public class Question3 {
    static class Employee{
        String name;
        int yearOfJoining;
        String address;
        Employee(String name, int yearOfJoining, String address){
            this.name = name;
            this.yearOfJoining = yearOfJoining;
            this.address = address;
        }
    }
    public static void main(String[] args) {
        Employee emp1 = new Employee("Robert", 1994, "64C- Walls Street");
        Employee emp2 = new Employee("Sam", 2000, "68D- Walls Street");
        Employee emp3 = new Employee("John", 1999, "26B- Walls Street");
        System.out.println("Name\tYear of Joining\tAddress");
        System.out.println(emp1.name +"\t" + emp1.yearOfJoining +"\t" + emp1.address);
        System.out.println(emp2.name +"\t" + emp2.yearOfJoining +"\t"+ emp2.address);
        System.out.println(emp3.name +"\t" + emp3.yearOfJoining +"\t"+ emp3.address);
    }
}
