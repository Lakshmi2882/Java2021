package javaprograms;

public class revstring {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String r="Raghu";
		String rev=" ";
	for(int i=r.length()-1;i>=0;i--)
	{
		rev=rev+r.charAt(i);
		
	}
	System.out.println("reverse string is:"+rev);
	}

}
