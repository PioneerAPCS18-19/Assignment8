/**
 * CheckingAccount models a bank account and can
 * simulate time passing, as well as taking
 * deposits and withdrawls.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */

public class CheckingAccount
{
    private double balance;
    private double rate;  // as decimal, compounds monthly
    private String owner;
    private int acctAge;  // in months

    /**
     * Constructor
     *
     * @param double for balance, double for rate, String for account owner
     *
     * Create account with starting balance a, interest rate r, owner own
     * Remember to initialize all class variables.
     */
    public CheckingAccount(double bal, double r, String own)
    {
        balance = bal;
        rate = r;
        owner = own;
        acctAge = 0;
    }


    
    /**
     * Constructor
     *
     * @param String for account owner
     *
     * Create account with owner given, but without an initial deposit.
     * Remember to initialize all class variables (set rate = 0.001).
     */
    public CheckingAccount(String own)
    {
        owner = own;
        balance = 0;
        rate = 0.001;
        acctAge = 0;
    }



    /**
     * getBalance
     * 
     * @param none
     * @return returns the current balance in the account as a double
     */
    public double getBalance()
    {
        return balance;
    }


    
    /**
     * getOwner
     * 
     * @param none
     * @return returns the owner of the account as a string
     */
    
    // your implementation...


    
    /**
     * getRate
     * 
     * @param none
     * @return returns the interest rate for the account
     */
    
    // your implementation...


    
    /**
     * getAge
     * 
     * @param none
     * @return returns the current age of the account
     */
    
    // your implementation...
    

    
    /**
     * processDeposit
     *
     * @param amount to be deposited as double
     * @return none
     *
     * Amount is added (deposited) to current balance
     */
    
    // your implementation...
    

    
    /**
     * processWithdrawal
     *
     * @param amount to be withdrawn as double
     * @return none
     * 
     * Amount is deducted (withdrawn) from the current balance
     */ 
    
    // your implementation...


    
    /**
     * runMonth
     *
     * @param none
     * @return none
     *
     * A month is simulated (passed). Interest is added to balance
     * and acctAge is incremented by one.
     * 
     * A = P * (1 + (rate / 12))
     * 
     * P is current ammount
     * A is new amount after interest is added.
     */
    
    // your implementation...
     









    /** DO NOT EDIT BELOW HERE */




    /**
     * runNMonths
     *
     * @param number of months to simulate as an int
     * @return none
     *
     * N months are simulated (passed).
     */
    public void runNMonths(int n)
    {
        for(int i = 0; i < n; i++)
        {
            runMonth();
        }
    }

    /**
     * printInfo
     *
     * @param none
     * @return none
     * 
     * Prints account info (age, owner, rate, balance).
     */
    public void printInfo()
    {
        System.out.println("Checking Account (" + acctAge + " months old)");
        System.out.println("Rate: " + (rate * 100) + "%");
        System.out.println("Owner: " + owner);
        double b = Math.round(balance * 100.0) / 100.0;
        System.out.println("Balance: $" + b + "\n");
    }
}
