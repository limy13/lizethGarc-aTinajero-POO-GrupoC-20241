
package com.mycompany.tarea6u2;

public class Product {
    
    private String name;
    private float price;
    private int stock; 
    public boolean band4 = true;
    
    public Product(String name, float price, int stock){
        this.name = name;
        this.price = price;
        this.stock = stock;
    }
    
    public Product(String name, float price){
        this.name = name;
        this.price = price;
        this.stock = 0;
    }
     
    String getName(){
        return String.format("Name: %s", name); 
    }
    
    void setName(String name){
        if (name.equals("")){
            System.out.println("Invalid name");
        }
        else{
            this.name = name;
            band4 = false;
        } 
    }
    
    String getPrice(){
        return String.format("Price: " + price); 
    }
    
    void setPrice(float price){
        if (price <= 0){
            System.out.println("Invalid price\n");
        } 
        else{
            this.price = price;
            band4 = true;
        }     
    }
    
    String getStock(){
        return String.format("Stock: %d", stock); 
    }
    
    void setStock(int stock){
        if (stock < 0){
            System.out.println("Invalid stock\n");
        }
        else {
            this.stock = stock;
            band4 = false;
        }
    }
    
    void increaseStock(int amount){
       if (amount > 0){
            this.stock = this.stock + amount;
            System.out.println("Successful operation");
       }
       else {
            System.out.println("Nothing was added");
       }   
    }
    
    void reduceStock(int amount){
        if (amount > this.stock || amount <= 0){
            System.out.println("Invalid reduction");
        }
        else {
            this.stock = this.stock - amount;
            System.out.println("Successful operation");
        }
    }  
}
