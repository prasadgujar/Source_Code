/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.projlogin;

import javax.ejb.Stateful;

/**
 *
 * @author prasad
 */
@Stateful(mappedName = "stateful123")  
public class Bank implements BankRemote {
private int amount=0;  
@Override
    public boolean withdraw(int amount){  
        if(amount<=this.amount){  
            this.amount-=amount;  
            return true;  
        }else{  
            return false;  
        }  
    }  
    public void deposit(int amount){  
        this.amount+=amount;  
    }  
    public int getBalance(){  
        return amount;  
    }  
    // Add business logic below. (Right-click in editor and choose
    // "Insert Code > Add Business Method")
}
