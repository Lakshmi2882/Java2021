package pavan;

public class FinallyConcept {

	public static void main(String[] args) {
		//finally block will be used only with try and catch block
		try
		{
		int i=9/0;
		}
		catch(ArithmeticException e)
		{
			System.out.println("Arithemetic Exception is coming");
		}
		finally
		{
			System.out.println("finally concept");
		}
		System.out.println("Bye!!!");
		try
		{
			int j=4/0;
		}
		catch(NullPointerException e)
		{
			System.out.println("Null pointer Exception");
		}
		finally
		{
			System.out.println("not handled Exception");
		}
		System.out.println("Bye");

	}

}
