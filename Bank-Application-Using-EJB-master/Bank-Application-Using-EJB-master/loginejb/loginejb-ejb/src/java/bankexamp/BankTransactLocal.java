/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bankexamp;

import javax.ejb.Local;

/**
 *
 * @author prasad
 */
@Local
public interface BankTransactLocal {

    

    int withdraw(int amount);

    public void deposit(int amount);

  
    
}
