
package com.mycompany.tarea8u2;
import java.util.ArrayList;

public class BookShop {
    
    private ArrayList<User> user = new ArrayList();
    private ArrayList<Books> book = new ArrayList();
    private ArrayList<Books> unrentedBooks = new ArrayList();
    private ArrayList<Books> rentedBooks = new ArrayList();
    private ArrayList<User> userPurchased = new ArrayList();
    private String f;
    
    public void addUser(User newUser){
        user.add(newUser);
        System.out.println("\nSuccessful registration\n");
    }
    
    public void addBook (Books newBook){
        book.add(newBook);
        unrentedBooks.add(newBook);
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
            System.out.println("\n---- Book " + x + " ----");
            System.out.println(i.bookInfo());
            x++;
        }
    }

    public boolean rentedBooks(String bookId){
        boolean band = false;
        for (Books i : book){
            f = i.bookInfo();
            if (f.contains(bookId) == true){
                band = true;
            }
        }
        if (band == false){
            System.out.println("Rent failed");
        }        
        return band;      
    }

    public void addRentedBook(String bookId){
        for (Books i : book){
            f = i.bookInfo();
            if (f.contains(bookId) == true){
                rentedBooks.add(i);
                unrentedBooks.remove(i);
            }
        }
    }

    public void addUsersPurchases(String userId){
        for (User i : user){
            f = i.userInfo();
            if (f.contains(userId) == true){
                userPurchased.add(i);
            }
        }
    }

    public void showUnrentedBooks(){
        int x = 1;
        for (Books i : unrentedBooks){
            System.out.println("---- Book " + x + " ----");
            System.out.println(i.bookInfo());
            x++;
        }
    }

    public boolean usersPurchased(String idUser){
        boolean band = false;
        for (User i : user){
            f = i.userInfo();
            if (f.contains(idUser) == true){
                band = true;
            }
        }
        return band;
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
        int x = 1;
        for (User i : userPurchased){
            System.out.println("---- User " + x + " ----");
            System.out.println(i.userInfo());
            x++;
        }
    }
}