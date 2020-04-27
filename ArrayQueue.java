import java.util.Arrays;

public class ArrayQueue<T> implements Queue<T>{

	protected int size;
	private T[] Queue;
	private static int front, rear;
	
	//constructor. initialize array of queue with length 10 and set front and rear to 0 because the array is empty at first.
	public ArrayQueue()
	{
		front = rear = 0;
		size = 10;
		Queue = (T[]) new Object[10];
	    
	      
	}
	
	//removes item from queue
	public T dequeue() throws Exception
	{
		T placeholder = (T) Queue[front];
		front++;
		size--;
		return placeholder;
		
	}
	
	//inserts item taken as parameter into queue while doubling size if queue array happens to be full
	public void enqueue(T item)
	{
		 if (size == Queue.length) 
		 {
			 doubleSize();
	     }
		 Queue[rear] = item; 
         rear++; //after adding item rear index is increased by 1. same goes for size.
         size++;
	}
	
	//returns true if empty and false otherwise
	public boolean empty()
	{
		if(size == 10)
		{
			return true;
		}
		else
		{
			return false;
		}
	}
	
	//method for doubling the size of queue array when it is full. is called in enqueue.
	public void doubleSize()
	{
		 int newSize = Queue.length * 2;
	     Queue = Arrays.copyOf(Queue, newSize);
	}
}
