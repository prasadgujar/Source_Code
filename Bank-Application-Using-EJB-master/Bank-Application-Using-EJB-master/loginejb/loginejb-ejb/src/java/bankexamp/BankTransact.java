/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bankexamp;

import javax.ejb.Stateful;

/**
 *
 * @author prasad
 */
@Stateful
public class BankTransact implements BankTransactLocal {
    
    int balance  = 1000;
   

    // Add business logic below. (Right-click in editor and choose
    // "Insert Code > Add Business Method")

    @Override
    public int withdraw(int amount) {
        balance  = balance - amount;
        return balance;
    }

    @Override
    public void deposit(int amount) {
          balance = balance + amount;
    }

  

  

}
