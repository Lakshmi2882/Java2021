
public class reverseastring {

	public static void main(String[] args) {
		StringBuilder name=new StringBuilder("Hello");
	System.out.println(	name.reverse());
	String str="Lakshmi";
	String rev="";
	for(int i=str.length()-1;i>=0;i--)
	{
		rev=rev+str.charAt(i);
	}
System.out.println(rev);
	}

}
