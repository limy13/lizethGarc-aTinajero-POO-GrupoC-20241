
package com.mycompany.tarea7u2;

public class BankAccount {
    private long accountNumber;
    private char tipe;

    public BankAccount(long accountNumber, char tipe) {
        this.accountNumber = accountNumber;
        this.tipe = tipe;
    }

    public void setAccountNumber(long accountNumber) {
        this.accountNumber = accountNumber;
    }

    public void setTipe(char tipe) {
        this.tipe = tipe;
    }

    public String Array(){
        String x = String.format("Account number: " + this.accountNumber + "\nTipe of account: " + tipe + "\n");
        return x;
    }          
}


    

