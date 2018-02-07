/*
 * setup the information of each customer
 * Contructor has default values but you can set others  
 */
package rentalbyke;

/**
 * @author Jesus Nieto
 */
public class customer {
    // 3 plan and 1 promotion
    private float priceHour;  // double (price could be with decimal next time)
    private float priceDay;   // double (price could be with decimal next time)
    private float priceWeek;  // double (price could be with decimal next time)
    private double total; // double (price could be with decimal next time)
        
    // constructor ()  set a initila values
    public customer(){
        this.priceHour = 5;
        this.priceDay = 20;
        this.priceWeek = 60;
        this.total = 0;
    }  
    
    // constructor (initial prices of plans) ** my suggest to the future values ***
    public customer(float ph, float pd, float pw, float ad){
        this.priceHour = ph;
        this.priceDay = pd;
        this.priceWeek = pw;        
        this.total = 0;
    }     
            
    public void setHour(byte num){ // number of hours
        this.total += (this.priceHour * num);
    }
        
    public void setDay(byte num){  // number of days
        this.total += (this.priceDay * num);        
    }
    
    public void setWeek(byte num){ // number of weeks
        this.total += (this.priceWeek * num);               
    }
    
    public double getTotal(){
        return this.total;
    }
    
    
}
