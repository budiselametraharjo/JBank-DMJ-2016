
/**
 * Teller class initialise the other class to do their function. If a customer wants to create
 * new accounts, then teller clas is the one who execute the process using the other clasess.
 * Teller class wil calls the method and input the specific variable.
 * 
 * @author Budi Selamet Raharjo
 * @version 0.2
 * @date 25 February 2016
 */
public class Teller
{
    // instance variables - replace the example below with your own
   
   
    /**
     * Constructor for objects of class Teller
     */
    public Teller()
    {
        // initialise instance variables
     
    }

    /**
     * The main method of class teller. This method calls the other method from the other class.
     * Here the variable are specified. All the variable that have been saved will be used and displayed
     * with the specified functions in this method.
     */
    public static void main(String[] args)
    {
       
        
        Customer c1 = new Customer();
        Account a1 = new Account(), acc;
        c1.setName("Sanadhi","Sutandi");
        System.out.println(c1.getName());
        a1.setBalance(1000);
        c1.setAccount(a1);
        acc = c1.getAccount();
        System.out.println(acc.getBalance());
        
    }
    
    
    
}
