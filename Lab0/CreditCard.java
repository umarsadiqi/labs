/**
 * Rahul Kanwal 3144895
 */

/**
 * This is an example of Javadoc documentation.
 * A simple model for a consumer credit card.
 * The task is to: 
 * 		1. Understand and execute the code, then explain why the original Balance displayed for each card is different.
 * 		2. Modify the class to include a method that updates the credit limit. (2)
 *  	3. Use the method from Q2 to update the credit limit of the last CreditCard in the wallet to 3000 and display the new card summary
 * 		4. Modify the makePayment method so that it ignores requests to process a negative payment amount. (2)
 * 		5. Provide the code to test that your code for Q4 works as expected. 
 * 		6. Modify the printSummary method to a non-static method and modify the main method code to work accordingly with this modification. (2)
 * 		7. Explain the difference between a static and a non-static method in a class.
 * 		8. Add a toString() method that returns a String representation of a CreditCard (instead of printing it to the console like printSummary). (2)
 * 				- Use StringBuilder for this method
 * 		9. Print the details of the wallet again, using the standard println statement to print the String representation of each card.
 *
 * @author ACS-2947 Lab 0
 * Adapted from Michael T. Goodrich, Roberto Tamassia, Michael H. Goldwasser
 * 
 */

/**
 *  1.
 *  Answer.   Original Balance is displayed differently for each card because the variable "initialBal" defines the initial
 *            value of each account which is set by the constructor when an object is created ; so for every instance there
 *             is a different value.
 *  2.
 *  Answer.   The method setLimit updates the credit limit
 *
 *  7.
 *  Answer. Static object is linked to the class itself instead of the object instance i.e, one copy is shared among all objects i.e, onmly one static copy
 *          in a class whereas non static are related with object i.e., every instance has it's own copy.
 *
 */
public class CreditCard {
  // Instance variables:
  private String customer;      // name of the customer (e.g., "John Bowman")
  private String bank;          // name of the bank (e.g., "California Savings")
  private String account;       // account identifier (e.g., "5391 0375 9387 5309")
  private int limit;            // credit limit (measured in dollars)
  protected double balance;     // current balance (measured in dollars)

  // Constructors:
  /**
   * Constructs a new credit card instance. This is a full-argument constructor
   * @param cust        the name of the customer (e.g., "John Bowman")
   * @param bk          the name of the bank (e.g., "California Savings")
   * @param acnt        the account identifier (e.g., "5391 0375 9387 5309")
   * @param lim         the credit limit (measured in dollars)
   * @param initialBal  the initial balance (measured in dollars)
   */
  public CreditCard(String cust, String bk, String acnt, int lim, double initialBal) {
    customer = cust;
    bank = bk;
    account = acnt;
    limit = lim;
    balance = initialBal;
  }

  /**
   * Constructs a new credit card instance with default balance of zero.
   * @param cust    the name of the customer (e.g., "John Bowman")
   * @param bk      the name of the bank (e.g., "California Savings")
   * @param acnt    the account identifier (e.g., "5391 0375 9387 5309")
   * @param lim     the credit limit (measured in dollars)
   */
  public CreditCard(String cust, String bk, String acnt, int lim) {
    this(cust, bk, acnt, lim, 0.0);               // use a balance of zero as default
  }

  // Accessor methods:
  /** Returns the name of the customer. */
  public String getCustomer() { return customer; }

  /** Returns the name of the bank */
  public String getBank() { return bank; }

  /** Return the account identifier. */
  public String getAccount() { return account; }

  /** Return the credit limit. */
  public int getLimit() { return limit; }

  /** Return the current balance. */
  public double getBalance() { return balance; }

  // Update methods:
  /**
   * Charges the given price to the card, assuming sufficient credit limit.
   * @param price  the amount to be charged
   * @return true  if charge was accepted; false if charge was denied
   */
  public boolean charge(double price) {               // make a charge
    if (price + balance > limit)                      // if charge would surpass limit
      return false;                                   // refuse the charge
    // at this point, the charge is successful
    balance += price;                                 // update the balance
    return true;                                      // announce the good news
  }

  /**
   * Processes customer payment that reduces balance.
   * @param amount  the amount of payment made
   */
  public void makePayment(double amount) {            // make a payment
    if(amount>0) {
      balance -= amount;
    }
    //if its negative it will be ignored

  }

  // Utility method to print a card's information
  //Modifying as required in question
  public void printSummary() {
    System.out.println("Customer = " + this.customer);
    System.out.println("Bank = " + this.bank);
    System.out.println("Account = " + this.account);
    System.out.println("Balance = " + this.balance);  // implicit cast
    System.out.println("Limit = " + this.limit);      // implicit cast
  }

  /**
   * Changes the limit to the new limit that was entered
   * @param limit the new limit to be set
   */
  public void setLimit(int limit) {
    this.limit=limit;
  }

  public String toString() {
    StringBuilder a = new StringBuilder();
    a.append("Customer = " + this.customer + "\n");
    a.append("Bank = " + this.bank +"\n");
    a.append("Account = " + this.account + "\n");
    a.append("Balance = " + this.balance + "\n");
    a.append("Limit = " + this.limit);

    return a.toString();
  }

  public static void main(String[] args) {
    CreditCard[] wallet = new CreditCard[3];
    wallet[0] = new CreditCard("John Bowman", "California Savings",
                               "5391 0375 9387 5309", 5000);
    wallet[1] = new CreditCard("John Bowman", "California Federal",
                               "3485 0399 3395 1954", 3500);
    wallet[2] = new CreditCard("John Bowman", "California Finance",
                               "5391 0375 9387 5309", 2500, 300);

    for (int val = 1; val <= 16; val++) {
      wallet[0].charge(3*val);
      wallet[1].charge(2*val);
      wallet[2].charge(val);
    }


    for (CreditCard card : wallet) {
      //CreditCard.printSummary(card);        // calling static method
      wallet[2].printSummary();
      while (card.getBalance() > 200.0) {
        card.makePayment(200);
        System.out.println("New balance = " + card.getBalance());
      }
      System.out.println();
    }
    //last used credit card is John Bowan's California Finance
    //updating the limit to 3000
    System.out.println("*** Changing limit to 3000 ***");
    wallet[2].setLimit(3000);
    wallet[2].printSummary();

    //Testing if changed makePayment works
    System.out.println("\n" + " ***   Testing if changed makePayment works   ***");
    wallet[2].makePayment(-300);
    wallet[2].printSummary();

    System.out.println("\n" + "***   Calling the toString explicitly   ***");
    System.out.println(wallet[2]); //or can also call as wallet[2].toString dosen't matter
  }
}

