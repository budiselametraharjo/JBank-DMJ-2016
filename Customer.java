import java.util.regex.*;
/**
 * Customer class keeps the information of the customer. It saves the address and the 
 * account that ties with it. If a new customer is to be serviced, then customer class
 * will have all the method to complete the process. The customer class also gives the id
 * of every customer that later would be used as identification for other class.
 * 
 * @author Budi Selamet Raharjo
 * @version 0.2
 * @date 25 February 2016
 */
public class Customer
{
    private String cityAddress,dateOfBirth,email,firstName,lastName,streetAddress,phoneNumber,zipOrPostalCode;
    private int custId,numberOfCurrentAccounts;
    private Account accounts = new Account();
    private static final String emailPattern = "^[_A-Za-z0-9-\\+]+(\\.[_A-Za-z0-9-]+)*@"
                                               + "[A-Za-z0-9-]+(\\.[A-Za-z0-9]+)*(\\.[A-Za-z]{2,})$";
    
    
    public Customer(String fname, String lname) {
       this(fname, lname, "none");
            
    }
    
    public Customer(String fname, String lname, String dob) {
        firstName = fname;
        lastName = lname;
        dateOfBirth = dob;
        custId = Bank.getNextID();
        
    }
    
    public Customer(String firstName, String lastName, String dateOfBirth, int custId){
        
    }
    
        /**
         * Take the saved detail of address of a customer.
         * @return streetAddress, the detail of the street
         * @return cityName, the detail of the city
         * @return zipOrPostalCode
         */
    private String getAddress() {
        
        return streetAddress+cityAddress+zipOrPostalCode;
    }
        
        /**
         * Take the detail of the account.
         * @return account, the saved account value
         */
    public Account getAccount() {
        return accounts;
    }
    
        /**
         * Take the specific customer ID.
         * @return custID, the detail of the customer ID
         */
    private int getCustomerId() {
        
        return custId;
    }
    
        /**
         * Take the email of the specified customer.
         * @return email, the value of email for the customer
         * 
         */
    private String getEmail() {
        
        return email;
    }
    
        /**
         * Take the Name of the specified customer.
         * @return lastName, the last name of the customer
         * @return firstName, the first name of the customer
         */
    public String getName() {
        
        return lastName+","+firstName;
    }
    
        /**
         * Take the total number of current accounts.
         * @return numberOfCurrentAccounts, total number of accounts
         */
    public int getNumOfAccounts() {
        
        return numberOfCurrentAccounts;
    }
    
        /**
         * Take the phone number of the customer.
         * @return phoneNumber, the customer phone number
         */
    private String getPhoneNumber() {
        
        return phoneNumber;
    }
    
        /**
         * This method save the detail of a customer address. 
         * @param street, the street address of a customer
         * @param city, the city address of a customer
         * @param code, the postal code of a customer address
         *
         */
    private void setAddress(String street, String city, String code) {
        
        streetAddress = street;
        cityAddress = city;  
        zipOrPostalCode = code;
    }
    
        /**
         * This method save the detail of a customer email. The email that will be saved will
         * be checked if it is in the right form. The email will be compared to common email
         * pattern.
         * @param emailAddress, the inputted email address of a customer
         */
    public boolean setEmail(String emailAddress) {
        Pattern p = Pattern.compile(emailPattern);
        Matcher m = p.matcher(emailAddress);
        boolean b = m.matches();
        
        if (b=true){
            email=emailAddress;
            return true;
        } 
        else {
            return false;
        }
    }
    
        /**
         * Save the detail of the name of the customer. 
         * @param fname, the first name of the customer
         * @param lname, the last name of the customer
         */
    public void setName(String lname, String fname) {
        firstName = fname;
        lastName= lname;
    }
    
        /**
         * Save the phone number of customer.
         * @param phoneNum, the phone humber of the customer
         */
    private void setPhoneNumber(String phoneNum) {
        phoneNumber=phoneNum;
       
    }
    
        /**
         * Create account variable that refer to the account in class account. This variable
         * will be used to match the detail of customer and the detail of customer.
         * @param account, the specified account
         */
    public void setAccount(Account account ){
        accounts = account;
        
    }
    
}

