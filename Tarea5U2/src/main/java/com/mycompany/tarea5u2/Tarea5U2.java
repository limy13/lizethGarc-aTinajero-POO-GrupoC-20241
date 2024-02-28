
package com.mycompany.tarea5u2;

public class Tarea5U2 {

    public static void main(String[] args) {
     
        System.out.println("--- Rectangle exercise ---");
        Rectangle rectangle = new Rectangle();
        System.out.println("\n* Double *\n");
        System.out.println(rectangle.getArea(3.87, 10));
        System.out.println(rectangle.getPerimeter(3.87, 10));
        System.out.println("\n* Int *\n");
        System.out.println(rectangle.getArea(4, 27));
        System.out.println(rectangle.getPerimeter(4, 27));
        
        System.out.println("\n--- Employee exercise ---");
        Employee employee = new Employee();
        System.out.println("\n* Base salary, Bonus, Extra hours *\n");
        System.out.println(employee.getSalary(5488.76, 1587.14, 15));
        System.out.println("\n* Base salary *\n");
        System.out.println(employee.getSalary(6478.65));
        System.out.println("\n* Base salary, Bonus *\n");
        System.out.println(employee.getSalary(7939.53, 3789.64));
        
        System.out.println("\n--- Taxes exercise ---");
        Taxes taxes = new Taxes();
        System.out.println("\n* Income *\n");
        System.out.println(taxes.getTaxes(87));
        System.out.println("\n* Sales, Tax percentage *\n");
        System.out.println(taxes.getTaxes(55,94.37));
        System.out.println("\n* Tax percentage, Dividends, Exemption *\n");
        System.out.println(taxes.getTaxes(78.5, 546.7, 67));
        System.out.println("\n* Tax percentage, Dividends, Exemption ELSE *\n");
        System.out.println(taxes.getTaxes(78.5, 236.09, 385.73)); 
    }
}
