package octoberjavainterviewquestions;

public class NullArgument {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

Test(null);

	}
	public static  void Test(Object o)
	{
		System.out.println("object type Argument");
	}
	public static void Test(String s)
	{
		System.out.println("string type argument");
	}
// public static void Test(StringBuffer s)
// {
//	 System.out.println("stringbuffer argument");//Test method is ambiguous for the type Null Argument
// }
}
