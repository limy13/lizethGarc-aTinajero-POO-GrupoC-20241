
package com.mycompany.tarea6u2;
import java.util.Scanner;

public class Tarea6U2 {

    public static void main(String[] args) {
        Scanner read = new Scanner (System.in);
        Scanner read1 = new Scanner (System.in);
        Scanner read2 = new Scanner (System.in);
        System.out.println("--- Product ---\n");
        System.out.print("Write a name: ");
        String name = read.nextLine();
        System.out.print("Price: ");
        float price = read.nextFloat();
        System.out.print("Stock: ");
        int stock = read.nextInt();
        Product product = new Product(name, price, stock);
        Product product1 = new Product(name, price);
        System.out.println("\n* Info *\n");
        System.out.println(product.getName());
        System.out.println(product.getPrice());
        System.out.println(product.getStock());
        System.out.println("\nWithout stock\n");
        System.out.println("* Info *\n");
        System.out.println(product1.getName());
        System.out.println(product1.getPrice());
        System.out.println(product1.getStock());
        int amount, decision, decision1, decision2;
        boolean band = true, band1 = true; 
        for (; band == true;){
            System.out.print("\nEdit the product? (1 = yes): ");
            decision = read1.nextInt();  
            if (decision == 1){
                for (; product.band4 == true;){
                    System.out.print("\nWrite a new name: ");
                name = read2.nextLine();
                product.setName(name);  
                }
                
                for (; product.band4 == false;){
                    System.out.print("New price: ");
                    price = read2.nextFloat();
                    product.setPrice(price);
                }
            
                for (; product.band4 == true;){
                    System.out.print("New stock: ");
                    stock = read.nextInt();
                    product.setStock(stock);
                }
                
                System.out.println("\n* Info *\n");
                System.out.println(product.getName());
                System.out.println(product.getPrice());
                System.out.println(product.getStock());
                for (; band1 == true;){
                    System.out.print("\nEdit stock? (1 = yes): ");
                    decision1 = read1.nextInt();
                    if (decision1 == 1){
                        System.out.println("\n1. Increase stock");
                        System.out.println("2. Reduce stock");
                        decision2 = read1.nextInt();
                        if (decision2 == 1){
                            System.out.print("\nAmount: ");
                            amount = read1.nextInt();
                            product.increaseStock(amount);
                        }
                        else {
                            System.out.print("\nAmount: ");
                            amount = read1.nextInt();
                            product.reduceStock(amount);
                        }
                    }
                    else {
                        band1 = false;
                    }
                }
            }
            else {
               band = false;       
            }    
        }
        
        System.out.println("\n* Final info *\n");
        System.out.println(product.getName());
        System.out.println(product.getPrice());
        System.out.println(product.getStock());
    }
}