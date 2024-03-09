
package com.mycompany.tarea7u2;

public class Bank {
    String accounts [] = new String [15];
    long accounts1 [] = new long [15];
    int z = 0, j = 1;
    private long accountNumber;
    private char tipe;
    private String c;
    boolean band = false;

    public Bank() {
    }

    public Bank(long accountNumber, char tipe) {
        this.accountNumber = accountNumber;
        this.tipe = tipe;
    }
    
    public void Array(long accountNumber, char tipe, String name){
        String x = String.format(j + ". Account number: " + accountNumber + "\nTipe of account: " + tipe + "\nOwner: " + name+ "\n");
        accounts[z] = x;
        accounts1[z] = accountNumber;
        z++;
        j++;
        System.out.println("Saved");
    }
    
    public void showAccounts(){
        int h = 0;
        for (; h < z; h++){
       System.out.println(accounts[h]);
           
        }
    }
    
    public void consultAccounts(long accountNumber1){
        int d = 0;
        for (; d < z  && band == false ;){
            if (accounts1[d] == accountNumber1){
                c = accounts[d];
                band = true;
            }
            else{
                d++;
            } 
        }
        
        if(band == true){     
            System.out.println(c);
            band = false;
        }
        else{
            System.out.println("\nAccount don't exist.");
        } 
    }
 }
    
