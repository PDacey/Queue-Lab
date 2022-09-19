/**
 * Thrown if queue is empty
 * @author Paul Dacey
 *
 */

public class EmptyQueueException extends Exception
{
	/**
	 * Constructor
	 */
	EmptyQueueException()
	{
		this("The queue is empty");
	}
	
	/**
	 * Parameterized Constructor
	 * @param s String of message to display
	 */
	EmptyQueueException(String s)
	{
		super(s);
	}
	
	
	
}
