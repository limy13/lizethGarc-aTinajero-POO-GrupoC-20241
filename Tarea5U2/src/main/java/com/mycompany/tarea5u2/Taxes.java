
package com.mycompany.tarea5u2;

public class Taxes {
    
    double taxes;
    
    String getTaxes(int income){
        taxes = income + 0.15;
        return String.format("Taxes: %f", taxes);
    }
    
    String getTaxes(int sales, double taxPercentage){
        taxes = sales * (taxPercentage / 100);
        return String.format("Taxes: %f", taxes);
    }
    
    String getTaxes(double taxPercentage, double dividends, double exemption){
        double total;
        taxes = dividends * (taxPercentage / 100);
        if (taxes > exemption){
            total = taxes - exemption;
            return String.format("Taxes: %f", total);
        } 
        else{
            total = 0;
            return String.format("Taxes: %f", total);
        } 
        
    }
    
}
