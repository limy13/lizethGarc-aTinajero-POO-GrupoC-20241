
package com.mycompany.tarea3poou2;

public class Person {
    
    
    String name;
    int age;
    String gender;
    String pet; 
    String profession;
    String maritalStatus; 
    String country;
    
    public Person (String name, int age, String gender, String pet, String profession,
            String maritalStatus, String country){
        
        this.name = name;
        this.age = age;
        this.gender = gender;
        this.pet = pet;
        this.profession = profession;
        this.maritalStatus = maritalStatus;
        this.country = country;
        
    }
    
    String getPersonInfo(){
        
        String data = String.format(" \n Name: %s \n Age: %d \n Gender: %s \n Pet: %s "
                + " \n Profession: %s \n Marital Status: %s \n Country: %s",
                name, age, gender, pet, profession, maritalStatus, 
                country);
        
        return data;
    }    
}
