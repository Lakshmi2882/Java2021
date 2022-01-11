package javaprograms;

public class stringcomparison {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str=" my name ";
		String str1="my name";
		System.out.println(str.equals(str1));
		System.out.println(str.trim());
		System.out.println(str.replace('m', 'o'));
		String date="28/04/1982";
		System.out.println(date.replace('/', '-'));
		//split
		String test="Hello_world_test_selenium";
	String newstring[]=	test.split("_");
	for(int i=0;i<newstring.length;i++)
	{
	System.out.println(newstring[i]);
	}
	
		
	}

}
