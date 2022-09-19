/**
 * Customer class sets up necessary information for customer
 * @author Paul Dacey
 */

//import java.util.Random;

public class Customer 
{
	/**
	 * Time customer entered the line
	 */
	private int clock;
	/**
	 * Transaction time for customer
	 */
	private int transTime;
	/**
	 * Customer Number
	 */
	private int customerNumber;
	/**
	 * Number of arrivals (Doesn't seem to be used)
	 */
	private int arrival = 0;
	
	/**
	 * Default constructor to initialize variables
	 */
	Customer()
	{
		clock = 0;
		transTime = 0;
		customerNumber = 1;
	}
	
	/**
	 * Parameterized constructor to set variables
	 * @param clock Current time
	 * @param transTime Amount of time for transaction
	 * @param arrivals Number of customers that have arrived
	 */
	Customer(int clock, int transTime, int arrivals)
	{
		this.clock = clock;
		this.transTime = transTime;
		this.arrival = arrivals;
	}
	
	/**
	 * Gets time customer arrived
	 * @return time of customers arrival
	 */
	public int getArrivalTime()
	{
		
		return clock - transTime;
	}
	
	/**
	 * Gets the time when customers transaction took place
	 * @return time of transaction
	 */
	public int getTransactionTime()
	{
		
		return transTime;
	}
	
	/**
	 * Gets the customers number
	 * @return Number of customer
	 */
	public int getCustomerNumber()
	{
		
		return arrival;
	}
}
