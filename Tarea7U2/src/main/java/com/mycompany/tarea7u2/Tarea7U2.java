
package com.mycompany.tarea7u2;
import java.util.Scanner;

public class Tarea7U2 {

    public static void main(String[] args) {
        Scanner read = new Scanner (System.in);
        Scanner read1 = new Scanner (System.in);
        Scanner read2 = new Scanner (System.in);
        Scanner read3 = new Scanner (System.in);
        Bank accounts = new Bank();
        int y;
        boolean band = true, band1 = true, band2 = true, band3 = true;
        long account, account1;
        String n, m;
        char tipe;
        Employee employee = new Employee ("Mariana Esteves", 25, 7000, 759497490,'A');
        employee.addAccount();
        System.out.println("\n------ Employee 1 ------");
        employee.getData();
        accounts.Array(759497490, 'A', "Mariana Esteves");
        for (int k = 0 ; band == true && k != 4 ; k++){ 
            System.out.println("\nAdd another account?");
            System.out.println("\n1. Yes.\t 2. No.");
            y = read.nextInt();
            if (y == 1){
                System.out.print("Account number: ");
                account = read2.nextLong();
                System.out.print("Account tipe: ");
                n = read3.nextLine();
                m = n.toUpperCase();
                tipe = m.charAt(0);
                employee.setAccount(account, tipe);
                employee.addAccount();
                accounts.Array(account, tipe, "Mariana Esteves");
            } 
            else{
                band = false;
            } 
        }
        
        Employee employee1 = new Employee ("Luis Rodriguez", 31, 12500.43, 453688939, 'B');
        employee1.addAccount();
        System.out.println("\n------ Employee 2 ------");
        employee1.getData();
        accounts.Array(453688939, 'B', "Luis Rodriguez");
        for(int i = 0; band1 == true && i != 4; i++){
            System.out.println("\nAdd another account?");
            System.out.println("\n1. Yes.\t 2. No.");
            y = read.nextInt();
             if (y == 1){
                System.out.print("Account number: ");
                account = read2.nextLong();
                System.out.print("Account tipe: ");
                n = read3.nextLine();
                m = n.toUpperCase();
                tipe = m.charAt(0);
                employee1.setAccount(account, tipe);
                employee1.addAccount();
                accounts.Array(account, tipe, "Luis Rodriguez");
                
            } 
            else{
                band1 = false;
            } 
        } 
        
        Employee employee2 = new Employee ("Elizabeth Castro", 40, 15000.87, 74943990, 'C');
        employee2.addAccount();
        System.out.println("\n------ Employee 3 ------");
        employee2.getData();
        accounts.Array(74943990, 'C', "Elizabeth Castro" );
        for (int j = 0; band2 == true && j != 4 ; j++){
            System.out.println("\nAdd another account?");
            System.out.println("\n1. Yes.\t 2. No.");
            y = read1.nextInt();
             if (y == 1){
                System.out.print("Account number: ");
                account = read2.nextLong();
                System.out.print("Account tipe: ");
                n = read3.nextLine();
                m = n.toUpperCase();
                tipe = m.charAt(0);
                employee2.setAccount(account, tipe);
                employee2.addAccount();
                accounts.Array(account, tipe, "Elizabeth Castro");
            } 
            else{
                band2 = false;
            } 
        }

        for (; band3 == true; ){
            System.out.println("\n--- Welcome ---\n");
            System.out.println("What do you want to do?\n");
            System.out.println("1. Employees information. \t2. Consult employee.\t3. Existing accounts. \t4. Consult account. \t5. Exit.");
            int x = read.nextInt();
            switch (x){

                case 1:
                    System.out.println("\n------ Employee 1 ------");
                    employee.getData();
                    System.out.println("\n------ Employee 2 ------");
                    employee1.getData();
                    System.out.println("\n------ Employee 3 ------");
                    employee2.getData();
                    
                    break;

                case 2:
                    System.out.println("1. Mariana Esteves\t 2. Luis Rodriguez\t 3. Elizabeth Castro");
                    y = read.nextInt();
                    switch (y){
                        case 1: 
                            System.out.println("\n------ Employee 1 ------");
                            employee.getData();
                            break;
                            
                        case 2:
                            System.out.println("\n------ Employee 2 ------");
                            employee1.getData();
                            break;
                            
                        default:
                            System.out.println("\n------ Employee 3 ------");
                            employee2.getData();
                    }

                    break;

                case 3: 
                    accounts.showAccounts();
                    break;

                case 4: 
                    System.out.print("\nWhat account do you want to consult?: ");
                    account1 = read2.nextLong();
                    accounts.consultAccounts(account1);
                    break;

                default:
                    band3 = false;
            }
        }
    }        
}
    


    

