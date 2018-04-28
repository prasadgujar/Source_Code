/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.projlogin;

import javax.ejb.embeddable.EJBContainer;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author prasad
 */
public class BankTest {
    
    public BankTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
    }
    
    @After
    public void tearDown() {
    }

    /**
     * Test of withdraw method, of class Bank.
     */
    @Test
    public void testWithdraw() throws Exception {
        System.out.println("withdraw");
        int amount = 0;
        EJBContainer container = javax.ejb.embeddable.EJBContainer.createEJBContainer();
        BankRemote instance = (BankRemote)container.getContext().lookup("java:global/classes/Bank");
        boolean expResult = false;
        boolean result = instance.withdraw(amount);
        assertEquals(expResult, result);
        container.close();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of deposit method, of class Bank.
     */
    @Test
    public void testDeposit() throws Exception {
        System.out.println("deposit");
        int amount = 0;
        EJBContainer container = javax.ejb.embeddable.EJBContainer.createEJBContainer();
        BankRemote instance = (BankRemote)container.getContext().lookup("java:global/classes/Bank");
        instance.deposit(amount);
        container.close();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getBalance method, of class Bank.
     */
    @Test
    public void testGetBalance() throws Exception {
        System.out.println("getBalance");
        EJBContainer container = javax.ejb.embeddable.EJBContainer.createEJBContainer();
        BankRemote instance = (BankRemote)container.getContext().lookup("java:global/classes/Bank");
        int expResult = 0;
        int result = instance.getBalance();
        assertEquals(expResult, result);
        container.close();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
