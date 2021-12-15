
public class Stack implements ReaderBlockStackI
{
	private Stack[] stack;
	private int top;
	private boolean initialized = false;
	private static final int maxCap = 100;

	public Stack(int maxCap)
	{
		this.stack = new Stack[maxCap];
		this.top = -1;
		initialized = true;
	}

	public void push(Stack newItem) throws Exception
	{
		while (initialized = true)
		{
			if (isFull())
			{
				throw new Exception("Stack is full. Unable to add item to Stack.");
			}
			stack[top + 1] = newItem;
			top++;
		}
	}

	public Stack peek() throws Exception
	{
		if (isEmpty())
		{
			throw new Exception("Stack is Empty. Unable to remove item to Stack.");
		}
		else
			return stack[top];
	}

	public boolean isEmpty()
	{
		return (top < 0);
	}

	public boolean isFull()
	{
		return (top == maxCap);
	}

	@Override
	public void addItem(String item)
	{
		try
		{
			this.push(stack[top + 1]);
		}
		catch (Exception ignored)
		{
		}
		System.out.println("Item added to stack");
	}

	@Override
	public String remove()
	{
		try
		{
			this.peek();
		}
		catch (Exception ignored)
		{
		}
		System.out.println("Item removed from stack");
		return this.remove();
	}
}
