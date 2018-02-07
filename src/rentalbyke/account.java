/*
 * Managment of account
 * The total of account is round to 2 decimal 
 * Contructor has default values but you can set others 
 */
package rentalbyke;

/**
 * @author Jesus Nieto
 */
import java.lang.Math;

public class account {
    private float discount;
    private double total;
    private byte counter;
    
    // constructor ()  set a initila values
    public account(){
        this.discount = 30;
        this.total = 0;
        this.counter = 0;
    }  
    
    // constructor (initial prices of plans) ** my suggest to the future values ***
    public account(float num){ // number of discount
        this.discount = num;
        this.total = 0;
        this.counter = 0;        
    }  
    
    public boolean addCustomer(double num){ //number of amount total customer
        if (this.counter < 5){
            this.total += num; 
            ++this.counter;
            return true;
        }
        return false;
    }
    
    public boolean delCustomer(double num){ //number of amount total customer
        if (this.counter > 0){
            this.total -= num; 
            --this.counter;
            return true;
        }
        return false;
    }
    
    public double getTotal(){
        double bigTotal;
        
        bigTotal = this.total;
        if (counter >= 3){ //3 to 5 customer in the same account give a discount 
            bigTotal = this.total - ( this.total * (this.discount/100)); 
        }

        bigTotal = Math.floor((bigTotal*100)+0.5)/100;  // round 2 decimal
        return bigTotal;
    }
    
    public byte countCustomer(){
        return this.counter;
    }
    
    public void restart(){
        this.total = 0;
        this.counter = 0;     
    }
    
    
}
