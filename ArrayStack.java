import java.util.Arrays;

public class ArrayStack<T> implements Stack<T>{
	
	protected int size;
	private T[] Stack;
	
	public ArrayStack()
	{
		 Stack = (T[]) new Object[10];
	     size = 0;
	}

	public void push(T item)
	{
		 if (size == Stack.length) 
		 {
			 doubleSize();
	     }
		Stack[size++] = item;
	}
	public T pop() throws Exception
	{
        T popped = (T) Stack[--size];
        Stack[size] = null;
        return popped ;
	}
	public T peek() throws Exception
	{
		T peeked = (T) Stack[size];
		return peeked;
	}
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

 	public void doubleSize()
	{
 		int newSize = Stack.length * 2;
	    Stack = Arrays.copyOf(Stack, newSize);
	}
}
