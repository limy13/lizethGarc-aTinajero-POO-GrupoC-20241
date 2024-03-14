
package com.mycompany.tarea8u2;
import java.util.ArrayList;

public class BookShop {
    
    private ArrayList<User> user = new ArrayList();
    private ArrayList<Books> book = new ArrayList();
    private ArrayList<Books> noRentedBooks = new ArrayList();
    private ArrayList<Books> rentedBooks = new ArrayList();
    private ArrayList<User> userPurchased = new ArrayList();
    private String f;
    
    public void addUser(User newUser){
        user.add(newUser);
        System.out.println("\nSuccessful registration\n");
    }
    
    public void addBook (Books newBook){
        book.add(newBook);
        noRentedBooks.add(newBook);
        System.out.println("\nSuccessful registration\n");
    }

    public void showInfoUsers () {
        int x = 1;
        for (User i : user){
            System.out.println("---- User " + x + " ----");
            System.out.println(i.userInfo());
            x++;
        }
    }

    public void showInfoBooks () {
        int x = 1;
        for (Books i : book){
            System.out.println("---- Book " + x + " ----");
            System.out.println(i.bookInfo());
            x++;
        }
    }

    public void rentedBooks(String idBook){
        for (Books i : book){
            f = i.bookInfo();
            if (f.contains(idBook) == true){
              rentedBooks.add(i);
            }
        }
    }


    public void usersPurchased(String idUser){
        for (User i : user){
            f = i.userInfo();
            if (f.contains(idUser) == true){
                userPurchased.add(i);
            }
        }
    }

    public void showRentedBooks(){
        int x = 1;
        for (Books i : rentedBooks){
            System.out.println("---- Book " + x + " ----");
            System.out.println(i.bookInfo());
            x++;
        }
    }

    public void showUserPurchased(){
        for (User i : userPurchased){
            System.out.println(i);
        }
    }
}