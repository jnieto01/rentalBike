/*
 * Test of account class
 */
package rentalbyke;


import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Jesus Nieto
 */
public class accountIT {
    
    /**
     * Test of addCustomer method, of class account.
     */
    @Test
    public void testAddCustomer() {
        System.out.println("addCustomer");
        account instance = new account();
        double num = 20;     
        boolean expResult = true;
        boolean result = false;
        byte i = 0; 
        
        while(i < 5){
            result = instance.addCustomer(num); // # customer
            ++i;
        }
        assertEquals(expResult, result);     
        if (!result)  fail("The test case is a prototype.");
    }

    /**
     * Test of delCustomer method, of class account.
     */
    @Test
    public void testDelCustomer() {
        System.out.println("delCustomer");
        account instance = new account();
        double num = 20;
        boolean expResult = true;
        instance.addCustomer(num);
        boolean result = instance.delCustomer(num); // # customer
        assertEquals(expResult, result);     
        if (!result)  fail("The test case is a prototype.");
    }

    /**
     * Test of getTotal method, of class account.
     */
    @Test
    public void testGetTotal() {
        System.out.println("getTotal");
        account instance = new account();
        double num = 20;
        instance.addCustomer(num);
        double expResult = 20;
        double result = instance.getTotal();
        assertEquals(expResult, result, 0.0);
        if (result != expResult) fail("The test case is a prototype.");
    }

    /**
     * Test of countCustomer method, of class account.
     */
    @Test
    public void testCountCustomer() {
        System.out.println("countCustomer");
        account instance = new account();
        double num = 20;
        instance.addCustomer(num);
        instance.addCustomer(num);
        byte expResult = 2;    
        byte result = instance.countCustomer();
        assertEquals(expResult, result);
        if (result != expResult) fail("The test case is a prototype.");
    }
    
    /**
     * Test of countCustomer method, of class account.
     */
    @Test
    public void testRestart() {
        System.out.println("restart");
        account instance = new account();
        double num = 20;
        instance.addCustomer(num);
        instance.restart();
        byte expResult = 0;    
        byte result = instance.countCustomer();
        assertEquals(expResult, result);
        if (result != expResult) fail("The test case is a prototype.");
    }    
    
}
