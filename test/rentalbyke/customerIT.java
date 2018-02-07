/*
 * Test of customer class
 */
package rentalbyke;

import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Jesus Nieto
 */
public class customerIT {
    
    /**
     * Test of setHour method, of class customer.
     */
    @Test
    public void testSetHour() {
        System.out.println("setHour");
        byte num = 4;
        customer instance = new customer();
        instance.setHour(num);
        double expResult = (5 * num);
        double result = instance.getTotal();
        assertEquals(expResult, result, 0.0);
        if (result != expResult)    fail("The test case is a prototype.");
    }

    /**
     * Test of setDay method, of class customer.
     */
    @Test
    public void testSetDay() {
        System.out.println("setDay");
        byte num = 4;
        customer instance = new customer();
        instance.setDay(num);
        double expResult = (20 * num);
        double result = instance.getTotal();
        assertEquals(expResult, result, 0.0);
        if (result != expResult)    fail("The test case is a prototype.");
    }

    /**
     * Test of setWeek method, of class customer.
     */
    @Test
    public void testSetWeek() {
        System.out.println("setWeek");
        byte num = 4;
        customer instance = new customer();
        instance.setWeek(num);
        double expResult = (60 * num);
        double result = instance.getTotal();
        assertEquals(expResult, result, 0.0);
        if (result != expResult)    fail("The test case is a prototype.");
    }

    /**
     * Test of getTotal method, of class customer.
     */
    @Test
    public void testGetTotal() {
        System.out.println("getTotal");
        customer instance = new customer();
        byte num = 4;
        instance.setHour(num); 
        double expResult = (5 * num);
        double result = instance.getTotal();
        assertEquals(expResult, result, 0.0);
        if (result != expResult)    fail("The test case is a prototype.");
    }
    
}
