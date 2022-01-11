package pavan;


public class stackImplementation {
	int[] array=new int[6];
	int top=0;
	public static void main(String[] args) {
		stackImplementation stack=new stackImplementation();
		stack.push(10);
		stack.push(20);
		stack.push(30);
		stack.push(40);
		stack.push(50);
		stack.pop();
		stack.peek();
		
		
	}
	public boolean push(int x)
	{    top++;
		 array[top]=x;
		System.out.println("Push the element into stack"+x);
		return true;
	}
	public int pop()
	{
		int x=array[top--];
		System.out.println("Pop out the element"+x);
		return x;
	}
	public int peek()
	{
		int x=array[top];
		System.out.println("Top element in an array"+x);
		return x;
	}

}
