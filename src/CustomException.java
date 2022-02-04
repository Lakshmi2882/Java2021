
public class CustomException {

	public static void main(String[] args) {
		try
		{
			int i=9/0;
			throw new Exception();
			
		}
		catch(Exception e)
		{
			System.out.println("Mathematicalthrows");
		}

	}

}
