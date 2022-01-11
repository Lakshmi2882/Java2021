package javaprograms;

public class vowelispresent {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		stringvowelornot("Lakshmi");
		
		stringvowelornot("LL");

	}
	
	public static boolean stringvowelornot(String input)
	{
		return input.toLowerCase().matches(".*[aeiou] ");
	}
}
