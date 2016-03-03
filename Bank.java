
/**
 * Bank class is the class that keep the data of the bank of the program. Here the basic
 * rules of what happens in the bank were specified in term of methods. The limitation of what
 * the other class can do or create wer also specified. Bank class also keeps the information 
 * of the bank itself.
 * 
 * @author Budi Selamet Raharjo
 * @version 0.2
 * @date 25 February 2016
 */
public class Bank
{
    // instance variables - replace the example below with your own
    private static double creditInterestRate, investmentInterestRate, premiumInterestRate;
    private static int lastCustID, nextCustID, numOfCurrentCustomer, nextID;
    public static int maxNumOfAcctsPerCustomer = 4;
    public  static int maxNumOfCustomers = 20;
    private static String closeTime, startTime;
    public static String website, phone;
    public static String Name= "JBANK", Address = "1234 JavaStreet, AnyCity, ThisState, 34567";
    
    private Bank(){
    
    
    }
    
    /*
    public static String getAddress() {
        return "";
    }
    */
   
    public static double getCreditRate() {
        return 0;
    }
    
    public static double getInvestmentRate() {
        return 0;
    }
    
    public static String getHoursOfOperation() {
        return "";
    }
    
    public static int getLastID() {
        return 0;
    }
    
    public static int getMaxCustomers() {
        return 0;
    }
    
   /*
   public static String getName() {
        return "";
     }
   */
    
     /**
         * This method counts the number of the number of customer ID everytime new customer ID is 
         * specified. The customer ID starts from 1000 as stated in variable definition, so the first 
         * customer ID that will be used is 1001. The new customer ID is of course the next number from
         * last customer ID. The last customer ID will be modified to the newly customer ID for future use.
         */
    public static int getNextID() {
        int currentCustID;
        
        if (nextCustID == 0){
            nextCustID= 1000;
            numOfCurrentCustomer++;
            currentCustID = nextCustID; 
            return currentCustID;
        } 
        else if (numOfCurrentCustomer == maxNumOfCustomers){
            currentCustID = 0;      
            return currentCustID;
        }
        else {
            lastCustID = nextCustID;
            nextCustID++;
            numOfCurrentCustomer++;
            currentCustID = nextCustID;
            return currentCustID;
        }
        
    }
        
    
    
    public static String getWebsite() {
        return "";
    }
    
    public static double getPremiumRate() {
        return 0;
    }
    
    public static String getPhone() {
        return "";
    }
    
    public static void setCreditRate(double rate) {
        
    }
    
    public static void setInvestmentRate(double rate) {
        
    }
    
    public static void setPremium(double rate) {
        
    }
    
    /*
    public static int getNumOfCurrentCustomer(){
        return numOfCurrentCustomer;
    }
    */
}
