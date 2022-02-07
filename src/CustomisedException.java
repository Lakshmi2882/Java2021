
public class CustomisedException {

	public static void main(String[] args) {
		try
		{ int i=9/0;
		throw new Exception("Radhika Exception");
		}
		catch(Exception e)
		{ e.printStackTrace();
			System.out.println("Exception is coming");
		}
	}

}
