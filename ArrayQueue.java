import java.util.Arrays;

public class ArrayQueue<T> implements Queue<T>{

	protected int size;
	private T[] Queue;
	private static int front, rear;
	
	public ArrayQueue()
	{
		front = rear = 0;
		size = 10;
		Queue = (T[]) new Object[10];
	    
	      
	}
	public T dequeue() throws Exception
	{
		T placeholder = (T) Queue[front];
		front++;
		size--;
		return placeholder;
		
	}
	
	public void enqueue(T item)
	{
		 if (size == Queue.length) 
		 {
			 doubleSize();
	     }
		 Queue[rear] = item; 
         rear++;
         size++;
	}
	
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
	
	public void doubleSize()
	{
		 int newSize = Queue.length * 2;
	     Queue = Arrays.copyOf(Queue, newSize);
	}
}
