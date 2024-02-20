
package com.mycompany.tarea3poou2;

public class Book {
    
     String title = "Coraline";
    String author = "Neil Gaiman";
    int yearPublication = 2002;
    String gender = "Novel";
    String languague = "English";
    int pages = 210;
    
    String getBookInfo (){
        
        String data = String.format(" \n Title: %s \n Author: %s \n Year of Publication: %d"
                + " \n Gender: %s \n Languague: %s \n Pages: %d",
                title, author, yearPublication, gender, languague, pages);
        
        return data;
    }
}

