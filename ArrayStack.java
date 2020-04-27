import java.util.Arrays;

public class ArrayStack<T> implements Stack<T>{
	
	protected int size;
	private T[] Stack;
	
	//constructor
	public ArrayStack()
	{
		 Stack = (T[]) new Object[10];
	     size = 0;
	}
	
	
	//inserts item into the stack array and also doubles the length of the array if it happens to be full.
	public void push(T item)
	{
		 if (size == Stack.length) 
		 {
			 doubleSize();
	     }
		Stack[size++] = item;
	}
	
	//returns item at the top of the stack array while also removing it
	public T pop() throws Exception
	{
        T popped = (T) Stack[--size];
        Stack[size] = null;
        return popped ;
	}
	
	//returns the item at the top of the stack array without removing it
	public T peek() throws Exception
	{
		T peeked = (T) Stack[size];
		return peeked;
	}
	
	//returns empty if size is 0 and false if it is any other value.
 	public boolean empty() 
	{
		if(size == 0)
		{
			return true;
		}
		else
		{
			return false;
		}
	}

 	//function that doubles the size of the object array stack. called when the array is full.
 	public void doubleSize()
	{
 		int newSize = Stack.length * 2;
	    Stack = Arrays.copyOf(Stack, newSize);
	}
}
