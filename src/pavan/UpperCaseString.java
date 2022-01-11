package pavan;

public class UpperCaseString {

	public static void main(String[] args) {
		String name="India Is My Country";
	char[] ch=	name.toCharArray();
	String upper="";
		for(int i=0;i<ch.length;i++)
		{
			if(Character.isUpperCase(ch[i])==true)
			{
				upper=upper+ch[i];
			}
		}
		System.out.println(upper);
	}

}
