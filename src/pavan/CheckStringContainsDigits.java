package pavan;

public class CheckStringContainsDigits {

	public static void main(String[] args) {
		System.out.println(isStringNumber("1234a*"));
		}
		public static boolean isStringNumber(String name)
		{
			for(int i=0;i<name.length();i++)
			{
				if((name.charAt(i)>='a')&&(name.charAt(i)<='z'))
				{
					return false;
				}
			}
			return true;

	}

}
