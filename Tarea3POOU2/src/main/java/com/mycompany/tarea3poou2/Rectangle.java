
package com.mycompany.tarea3poou2;

public class Rectangle {
    
     double width; 
    double length;
    double area;
    double perimeter;
    
    public Rectangle (double width, double length){
        this.width = width;
        this.length = length;
    }
    
    double getArea(){
       return area = width*length;
    }
    
    double getPerimeter(){
        return perimeter = 2*width+2*length;
    }
}

