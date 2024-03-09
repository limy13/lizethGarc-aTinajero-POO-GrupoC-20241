
package com.mycompany.tarea7u2;

public class Employee {
    private String name;
    private int age;
    private double salary;
    private BankAccount account;
    private long accountNumber;
    private char tipe;
    private Bank accounts;
    int z = 0;
    String array [] = new String [5]; 


    public Employee(long accountNumber, char tipe) {
        this.account = new BankAccount(accountNumber, tipe);
        this.accounts = new Bank(accountNumber, tipe);
    }
    
    public Employee(String name, int age, double salary) {
        this.name = name;
        this.age = age;
        this.salary = salary;
    }
    
    public Employee(String name, int age, double salary, long accountNumber, char tipe) {
        this.name = name;
        this.age = age;
        this.salary = salary;
        this.account = new BankAccount(accountNumber, tipe);
        this.accounts = new Bank(accountNumber, tipe);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        if (age >= 18 && age <= 65) {
            this.age = age;
        } else {
            System.out.println("Invalid age");
        }
    }

    public double getSalary() {
        return salary;
    }

    
    public void setSalary(double salary) {
        if (salary > 0) {
            this.salary = salary;
        } else {
            System.out.println("Invalid salary");
        }
    }

    public void setAccount(long accountNumber, char tipe) {
        this.account = new BankAccount(accountNumber, tipe); 
    }  
    
    public void addAccount(){
        String x = account.Array();
        if (z < 5){
            array[z] = x;
            z++; 
        }
    }
    
    public void Accounts(){
        int h = 0;
        for (; h < z ; h++){
                System.out.println(array[h]);
            }
    }
        
    public void getData() {
        String m;

        m = String.format("\nName: %s \nAge: %d \nSalary: %f",
                    this.getName(), this.getAge(), this.getSalary());
        System.out.println(m);
        System.out.println("\n--- Accounts ---\n ");
        Accounts();
    }
    
}

