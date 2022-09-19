import java.util.ArrayList;


/**
 * A class that acts as a type of queuing system
 * @author Paul Dacey
 *
 */

public class ArrayQueue<T> implements QueueInterface<T>
{
	/**
	 * ArrayList to act as a queue
	 */
	private ArrayList<T> queue = new ArrayList<>();
	/**
	 * integer to hold the value indicating the front of the line
	 */
	private int front = 0;
	//private int rear = 0;
	
	/** Adds a new entry to the back of this queue.
    @param newEntry  An object to be added. */
	@Override
	public void enqueue(T newEntry) {
		if(queue.isEmpty())
		{
			queue.add(newEntry);
		}
		else
		{
			front++;
			if(queue.size() > front)
			{
				queue.set(front, newEntry);
			}
			else
			{
				queue.add(newEntry);
			}
		}
		
		
	}

	/** Removes and returns the entry at the front of this queue.
    @return  The object at the front of the queue. 
    @throws  EmptyQueueException if the queue is empty before the operation. */
	@Override
	public T dequeue() throws EmptyQueueException
	{
		
		
		if(queue.isEmpty())
		{
			throw new EmptyQueueException();
		}
		T temp;
		if(front < queue.size())
		{
			temp = queue.get(front);
			queue.remove(front);
		}
		else
		{
			temp = queue.get(queue.size()-1);
			queue.remove(queue.size()-1);
		}
		
		
		front++;
		return temp;
	}

	/**  Retrieves the entry at the front of this queue.
    @return  The object at the front of the queue.
    @throws  EmptyQueueException if the queue is empty. */
	@Override
	public T getFront() throws EmptyQueueException
	{
		if(queue.isEmpty())
		{
			throw new EmptyQueueException();
		}
		return queue.get(front);
	}

	/** Detects whether this queue is empty.
    @return  True if the queue is empty, or false otherwise. */
	@Override
	public boolean isEmpty() {
		if(queue.isEmpty())
		{
			return true;
		}
		return false;
	}

	/** Removes all entries from this queue. */
	@Override
	public void clear() {
		queue.clear();
		
	}

	

	
	
}
