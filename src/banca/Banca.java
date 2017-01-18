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
public class Banca {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Account myAccount = new Account ();
        Account myOtherAccount = new Account (10.0, "1223312");
        System.out.println("Balance = " + myAccount.getBalance());
        System.out.println("Number = " + myAccount.getnumber());
        System.out.println("Balance = " + myOtherAccount.getBalance());
        System.out.println("Number = " + myOtherAccount.getnumber());
        myOtherAccount.deposit(50.0);
        System.out.println("New balance = " + myOtherAccount.getBalance());
        myAccount.withDrawal(05.0);
        myOtherAccount.withDrawal(35.0);
        System.out.println("my account balance = " + myAccount.getBalance());
        System.out.println("my other account balance = " + myOtherAccount.getBalance());
    }
    
}
