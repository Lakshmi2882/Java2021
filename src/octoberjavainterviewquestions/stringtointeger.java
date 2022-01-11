package octoberjavainterviewquestions;

public class stringtointeger {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str="12320";
	//int num1=Integer.parseInt(str);
	//System.out.println(num1)
		int v=0;
	for(int i=0;i<str.length();i++)
	{
	char ch=	str.charAt(i);
	v=v*10+Character.getNumericValue(ch);

	}
	System.out.println(v+10);
	
	}

}
