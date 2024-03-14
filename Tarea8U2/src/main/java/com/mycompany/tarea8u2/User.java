
package com.mycompany.tarea8u2;
import java.util.ArrayList;
import java.util.Random;

public class User {
    
    private ArrayList<String> id = new ArrayList();
    BookShop bookShop = new BookShop();
    Random random = new Random();
    private String name, address, y, c;
    private long phone;
    private int x;

    public User() {
    }

    public User(String name, String address, long phone) {
        this.name = name;
        this.address = address;
        this.phone = phone;
    }

    public void createUserId(){
        this.x = random.nextInt(1000) + 1;
        y = String.valueOf(x);
        boolean band2 = false;
        for (boolean band = false; band == false; ){
            for (String i: id){
                if (i.equalsIgnoreCase(y) == true){
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

    public boolean rentBook(String userId){
        boolean band = false, band2 = false;
        for (String i: id){
            if (i.equalsIgnoreCase(userId) == true){
                band = true;
                }
        }
        if (band != true){
            System.out.println("\nThe user doesn't exist");
        }
        return band;
    }    
            
    public String userInfo(){
        return c = String.format("Name: %s\n Address: %s\n", name, address + "\nPhone: " + phone + "\n" + "User ID: " + y);
    }

} 
    
   

