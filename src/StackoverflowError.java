
public class StackoverflowError {
static int i=0;
	public static void main(String[] args) {
		
StackoverflowError.printnumber(i);
	}
	public static int printnumber(int x)
	{
		i=i+2;
		System.out.println(i);
		
			
		return i+printnumber(i+2);
		
		
	}

}
