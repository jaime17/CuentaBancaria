/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package banca;

/**
 *
 * @author Alumno
 */
public class Account {
    private double balance;
    private String number;
   
    public Account (double balance, String number) {
        this.balance = balance;
        this.number = number;
    }
    
    public Account () {
        this(0.00, "Sin numero");
    } 
    
    public double getBalance () {
        return balance;
    }
    
    public void setBalance (double balance){
        this.balance = balance;
    }
    
    public String getnumber (){
        return number;
    }
    
    public void setnumber (String number){
        this.number = number;
        
    }
    
    public void deposit (double amount) {
        this.balance += amount; // balance=  balance + cantidad
    }
    
    public boolean withDrawal (double amount) {
        //this.balance -= amount;
        if (balance >= amount){
            this.balance -= amount;
            return true;
        } else {
            System.out.println("Insufficient founds");
            return false;
        }
    }
}
