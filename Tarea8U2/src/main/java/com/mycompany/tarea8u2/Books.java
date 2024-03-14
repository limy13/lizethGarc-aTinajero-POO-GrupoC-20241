
package com.mycompany.tarea8u2;
import java.util.ArrayList;
import java.util.Random;

public class Books {
    
    Random random = new Random();
    private ArrayList<String> id = new ArrayList();
    private String name, author, y;
    private double price;
    private int x, k; 
    private BookShop bookShop = new BookShop();

    public Books(){
    }

    public Books(String name, String author, double price) {
        this.name = name;
        this.author = author;
        this.price = price;
    }   

    public void createBookId(){
        this.x = random.nextInt(1000) + 1;
        y = String.valueOf(x);
        boolean band2 = false;
        for (boolean band = false; band == false; ){
            for (String i: id){
                if (y == i){
                    band2 = true;
                }
            }

            if (band2 == true){
                x = random.nextInt(1000) + 1;
                y = String.valueOf(x);
            }
            else{
                id.add(y);
                band = true;
            }
        }
    }

    public boolean rentBook(String bookId){
        boolean band = false, band2 = true;
        for (String i: id){
            if (i.equalsIgnoreCase(bookId) == true){
                band = true;
            }
        }
        return band;
    }

    public String bookInfo(){
        return y = String.format("Name: %s\n Author: %s\n Price: %f\n Book ID: %s", name, author, price, y);
    }

    public void showid(){
        for(String i : id){
            System.out.println(i);
        }
    }

}
