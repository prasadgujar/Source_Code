/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.projlogin;

import javax.ejb.Stateless;

/**
 *
 * @author prasad
 */
@Stateless
public class loginex implements loginexRemote {

    @Override
    public String validUser(String username, String password) {
     String res;
        if(username.equals("test"))
       {
           res = "Valid User";
       }
        else
        {
            res = "Invalid User";
        }
        
        return res;
    }

    // Add business logic below. (Right-click in editor and choose
    // "Insert Code > Add Business Method")
    
    
    
}
