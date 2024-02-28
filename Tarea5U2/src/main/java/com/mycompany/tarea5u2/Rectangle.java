
package com.mycompany.tarea5u2;

public class Rectangle {
    
    String getArea(double width, double length){
        double area = width * length;
        return String.format("Area: %f", area);
    }
    
    String getArea(int width, int length){
        int area = width * length;
        return String.format("Area: %d", area);
    }
    
    String getPerimeter(double width, double length){
        double perimeter = 2 * width+ 2 * length;
        return String.format("Perimeter: %f", perimeter);
    }
    
    String getPerimeter(int width, int length){
        int perimeter = 2 * width+ 2 * length;
        return String.format("Perimeter: %d", perimeter);
    }
}
