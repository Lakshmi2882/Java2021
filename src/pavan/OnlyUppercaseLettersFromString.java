package pavan;

public class OnlyUppercaseLettersFromString {

	public static void main(String[] args) {
		String name="autoMATIon";
		String upper="";
		for(int i=0;i<name.length();i++)
		{
			if(name.charAt(i)>='A'&&name.charAt(i)<='Z')
			{
				upper=upper+name.charAt(i);
			
			}
		}
		System.out.println(upper);
	}

}
