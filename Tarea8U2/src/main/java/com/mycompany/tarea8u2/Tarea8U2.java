
package com.mycompany.tarea8u2;
import java.util.Scanner;

public class Tarea8U2 {

    public static void main(String[] args) {
        
        Scanner read = new Scanner (System.in);
        Scanner read1 = new Scanner (System.in);
        Scanner read2 = new Scanner (System.in);
        Scanner read3 = new Scanner (System.in);
        BookShop bookShop = new BookShop();
        Books book = new Books();;
        User user = new User();
        int x;
        String name, author, address;
        long phone;
        String bookId, userId;
        double price;
        
        for (boolean band = true; band == true;){
            System.out.println("\n------ Welcome ------\n");
            System.out.println("What do you want to do?\n");
            System.out.println("1. Add user.\n2. Add book.\n3. Users.\n4. Books.\n5. Rent a book.\n" +
                     "6. Users who have already purchased.\n" +
                     "7. Rented books.\n8. Unrented books.\n9. Exit.");
            x = read.nextInt();
            switch(x){
                case 1:
                    System.out.print("\nName: ");
                    name = read1.nextLine();
                    System.out.print("Address: ");
                    address = read1.nextLine();
                    System.out.print("Phone: ");
                    phone = read2.nextLong();
                    user = new User (name, address, phone);
                    user.createUserId();
                    bookShop.addUser(user);
                    break;          
                 
                case 2:
                    System.out.print("\nName: ");
                    name = read1.nextLine();
                    System.out.print("Author: ");
                    author = read1.nextLine();
                    System.out.print("Price: ");
                    price = read3.nextDouble();
                    book = new Books (name, author, price);
                    book.createBookId();
                    bookShop.addBook(book);
                    break;
                    
                case 3:
                    bookShop.showInfoUsers();
                    break;
                    
                case 4:
                    bookShop.showInfoBooks();
                    break;
                    
                case 5:
                    System.out.println("User ID: ");
                    userId = read1.nextLine();
                    if (bookShop.usersPurchased(userId) == true){
                        System.out.print("Book ID: ");
                        bookId = read1.nextLine();  
                        if (bookShop.rentedBooks(bookId) == true){
                            bookShop.addRentedBook(bookId);
                            bookShop.addUsersPurchases(userId);
                            System.out.println("\nPurchased successful");
                        }
                    }
                   
                    // set de esto con su objeto usuario
                    // quw regrese un mensaje de renta exitosa
                    break;
                    
                case 6:
                    bookShop.showUserPurchased();
                    break;
                    
                case 7: 
                    bookShop.showRentedBooks();
                    break;
                    
                case 8:
                    bookShop.showUnrentedBooks();
                    break;
                    
                default:
                    band = false;               
            }
        }       
    }
}


  
