
public class output {

	public static void main(String[] args) {
	String haystack="hello";
	String needle="ll";
	int j=0;
	for(int i=0;i<haystack.length();i++)
	{
		if(needle.charAt(j)==haystack.charAt(i))
		{
			System.out.println(needle.length());
		}
	}
	
	
	
}
}
