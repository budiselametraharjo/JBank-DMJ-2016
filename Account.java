
/**
 * Account class keep the information of the account of specific customer ID. The information
 * about balance and other function when banking activity is done were using methods specified
 * in the account class. 
 *
 * @author Budi Selamet Raharjo
 * @version 0.2
 * @date 25 February 2016
 */
public class Account
{
    // instance variables - replace the example below with your own
    private char acctType;
    private double balance;
    private String id;

    public Account() {

    }

    public Account(char type, double amount) {
        //This method create new account with the account type and balance as specified input.
        acctType = type;
        balance = amount;

    }
    
    /**
         * This method add the deposit amount into balance of the account. The deposit will
         * be added to the current amount of the balance of the account. The deposit amount 
         * will be checked for negative number. If the deposit number is negative, the method will
         * return false.
         * 
         * @param amount, the amount of deposit
         */
        
    public boolean deposit(double amount) {
        
        if (amount > 0){
            balance = balance + amount;
            return true;
        }
        else {
            return false;
        }
    }
    
        /**
         * Take the current account type.
         * @return acctType, saved account type
         */
    public char getAcctType() {
        
        
        return acctType;
    }

        /**
         * Take the current balance.
         * @return balance, saved balance
         */
    public double getBalance() {
        
        return balance;
    }

         /**
         * Take the id of the current account.
         * @return id, saved ID
         */
    public String getId() 
    {
       
        return id;
    }

        /**
         * Specified the balance of the account.
         * @param amount, amount of the balance. Specifies the amount of the balance that will be saved.
         */
        
    public void setBalance(double amount) 
    {
        
        balance = amount;

    }

        /**
         * Specifies the ID of the account.
         * @param acctId, the ID of the account
         */
    public void setID(String acctId) 
    {
        
        id = acctId;

    }

        /**
         * Specifies the account type of the current account.
         * @param Type, type of the account
         */
    public void setAcctType(char type) 
    {
        
        acctType = type;

    }
    
    
     /**
         * This method will be used when customer withdraw from the account. The withrawed
         * amount will be checked if the current balance is enough. If the balance is enough,
         * the current balance will be subtracted for the amount of withdraw. Is the balance 
         * is not enough, the method will return false.
         * @param amount, the amount of withdraw
         * 
         */
    public boolean withdraw(double amount) {
       
        if (balance > amount){
            balance = balance - amount;
            return true;
        }
        else{
            return false;
        }
    }
}
