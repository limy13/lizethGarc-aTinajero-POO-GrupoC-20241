
package com.mycompany.tarea3poou2;

public class Tarea3POOU2 {

    public static void main(String[] args) {
        
        Person person1 = new Person("Luisa", 24, "Female", "Cat",
                "Teacher", "Single", "England");
        
        System.out.println(" - Person 1: ");
        System.out.println(person1.getPersonInfo()+"\n");
        
        Person person2 = new Person("Daniel", 30, "Male", "Dog",
                "Doctor", "Married", "France"); 
        
        System.out.println("--------------------");
        System.out.println("\n - Person 2: ");
        System.out.println(person2.getPersonInfo()+"\n");
        
        Person person3 = new Person ("Elizabeth", 18, "Female", "Bird",
                "Student", "Single", "EUA");
        
        System.out.println("--------------------");
        System.out.println("\n - Person 3: ");
        System.out.println(person3.getPersonInfo()+"\n");
        
        Person person4 = new Person ("Xavier", 35, "Male", "Hamster",
                "Accountant", "Married", "Mexico");
        
        System.out.println("--------------------");
        System.out.println("\n - Person 4: ");
        System.out.println(person4.getPersonInfo());
        System.out.println("\n ************ Books *************");
        
        Book book1 = new Book ();
        System.out.println("\n - Book 1: \n" + book1.getBookInfo()+"\n");
        
        Book book2= new Book();
        book2.title = "The Hunger Games";
        book2.author = "Suzanne Collins";
        book2.yearPublication = 2008;
        book2.gender = "Adventure";
        book2.languague = "Spanish";
        book2.pages = 374;
        System.out.println("--------------------");
        System.out.println("\n - Book 2: \n" + book2.getBookInfo()+"\n");
        
        Book book3 = new Book ();
        book3.title = "Me before you";
        book3.author = "Jojo Moyes";
        book3.yearPublication = 2012;
        book3.gender = "Romance";
        book3.languague = "French";
        book3.pages = 487;
        System.out.println("--------------------");
        System.out.println("\n - Book 3: \n" + book3.getBookInfo()+"\n");
        
        Book book4 = new Book();
        book4.title = "The Seven Husbands of Evelyn Hugo";
        book4.author = "Taylor Jenkins Reid";
        book4.yearPublication = 2017;
        book4.gender = "Historical Novel";
        book4.languague = "German";
        book4.pages = 380; 
        System.out.println("--------------------");
        System.out.println("\n - Book 4: \n" + book4.getBookInfo()+"\n");
        System.out.println("\n ************ Rectangle *************");
        
        Rectangle rectangle1 = new Rectangle(10, 5);
        System.out.println("\n - Rectangle 1: ");
        System.out.println("\n Area: " + rectangle1.getArea());
        System.out.println(" Perimeter: " + rectangle1.getPerimeter() + "\n");
        
        Rectangle rectangle2 = new Rectangle(18.7, 12.5);
        System.out.println("--------------------");
        System.out.println("\n - Rectangle 2: ");
        System.out.println("\n Area: " + rectangle2.getArea());
        System.out.println(" Perimeter: " + rectangle2.getPerimeter() + "\n");
        
        Rectangle rectangle3 = new Rectangle(20, 30);
        System.out.println("--------------------");
        System.out.println("\n - Rectangle 3: ");
        System.out.println("\n Area: " + rectangle3.getArea());
        System.out.println(" Perimeter: " + rectangle3.getPerimeter() + "\n");
        
        Rectangle rectangle4 = new Rectangle(53.4, 81);
        System.out.println("--------------------");
        System.out.println("\n - Rectangle 4: ");
        System.out.println("\n Area: " + rectangle4.getArea());
        System.out.println(" Perimeter: " + rectangle4.getPerimeter() + "\n");
    }
    
}

