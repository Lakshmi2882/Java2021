package javaprograms;

public class IsNumber {

	public static boolean isNumber(String number)
	{
		try {
		Long.parseLong(number);
		System.out.println("valid number :"+number);
		}
		catch(NumberFormatException e)
		{
			System.out.println("invalid number:"+number);
			return false;
		}
		return true;
	}
	public static boolean isValidphonenumber(String number)
	{
		if(number.length()==10 && isNumber( number))
		{
			System.out.println("valid phone number :"+number);
			return true;
		}
		else
		{
			System.out.println("Invalid phone number:"+number);
			return false;
		}
		
	}
	
	
	public static boolean isValidccnumber(String number)
	{
		if(number.length()==16 && isNumber( number))
		{
			System.out.println("valid cc number :"+number);
			return true;
		}
		else
		{
			System.out.println("Invalid cc number:"+number);
			return false;
		}
		
	}
	
	
	
	
	public static void main(String[] args) {
		
		//isNumber("123a");//number format exception
	System.out.println(	isNumber("123"));
	System.out.println(isNumber("123ee"));
	isValidphonenumber("2345645678");
	isValidphonenumber("23456456");
	isValidccnumber("2345634562345345>");

	}

}
