/*
 * The rental bike company has a 3 plans to offer theirs customer and 1 promotion.
 * Each customer can choose any plan or make a mix of plans.
 * Each account has a maximun of 5 customer for giving a promotion
 * 
 */
package rentalbyke;

/**
 * @author Jesus Nieto
 * @version 1.0.0.0
 * @see customer and account classes
 */
import java.util.Scanner;

public class RentalByke {

    public static void main(String[] args)   {
        account     new_acc;
        customer    new_cus;
        byte        plan, amount,aux1;
        
        
        Scanner sc = new Scanner(System.in); 
        new_acc =  new account(); // start a new account
        
        while(true){
            new_acc.restart();
            
            //*** load of customer data ***
            while(true){            
                new_cus = new customer();
                System.out.println("New account ");
                while(true){
                    // make sure the it recive a number
                    while(true){
                        System.out.println("Choose the plan ");
                        System.out.println("Hours = 1, Day = 2, Week = 3");                   
                        try{
                           plan = sc.nextByte();
                           break;
                        } catch (java.util.InputMismatchException e){
                           sc.nextLine(); //
                           System.out.println("Must choose a number");
                        }    
                    }
                    
                                        // make sure the it recive a number
                    while(true){
                        System.out.println("Give the amount");                       
                        try{
                           amount = sc.nextByte();
                           break;
                        } catch (java.util.InputMismatchException e){
                           sc.nextLine(); //
                           System.out.println("Must choose a number");
                        }    
                     }   
                    
                    if (plan == 1) new_cus.setHour(amount);
                    if (plan == 2) new_cus.setDay(amount);
                    if (plan == 3) new_cus.setWeek(amount);
                     
                    while(true){
                        System.out.println("Add another plan = 1");
                        try{
                           aux1 = sc.nextByte();
                           break;
                        } catch (java.util.InputMismatchException e){
                           sc.nextLine(); //
                           System.out.println("Must choose a number");
                        }
                    }    
                                            
                    if (aux1 != 1) break;                         
                }
                new_acc.addCustomer(new_cus.getTotal());
              
                if (new_acc.countCustomer() == 5){
                    System.out.println("The account has 5 customer already");                
                    break;
                }    
                System.out.println("Total of account = " + new_acc.getTotal());
                
                while(true){
                    System.out.println("Add another customer = 1");
                    try{
                        aux1 = sc.nextByte();
                        break;
                    } catch (java.util.InputMismatchException e){
                        sc.nextLine(); //
                        System.out.println("Must choose a number");
                    }                
                }    
                    
                if (aux1 != 1) break;                   
            }           
            
            while(true){
                System.out.println("Exit of system = 1");
                try{
                    aux1 = sc.nextByte();
                    break;
                } catch (java.util.InputMismatchException e){
                    sc.nextLine(); //
                    System.out.println("Must choose a number");
                }                
            }
            if (aux1 == 1) break;    
        }        
    }
    
}
