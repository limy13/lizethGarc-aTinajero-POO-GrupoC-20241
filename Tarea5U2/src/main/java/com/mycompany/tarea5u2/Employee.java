
package com.mycompany.tarea5u2;

public class Employee {
    
    double salary;
    
    String getSalary(double baseSalary, double bonus, int extraHours){
        salary = baseSalary + bonus + (extraHours * 20);
        return String.format("Salary: %f", salary);
    }
    
    String getSalary(double baseSalary){
        return String.format("Salary: %f", baseSalary);
    }
    
    String getSalary(double baseSalary, double bonus){
        salary = baseSalary + bonus;
        return String.format("Salary: %f", salary);
    }
    
    
}
