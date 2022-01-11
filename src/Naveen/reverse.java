package Naveen;

public class reverse {

	public static void main(String[] args) {
		String name="Naveen Automation Labs";
		String rev="";
		System.out.println("using for loop");
		for(int i=name.length()-1;i>=0;i--)
		{
			rev=rev+name.charAt(i);
		}
System.out.println(rev);
System.out.println("******************");
System.out.println("using stringbuffer");
StringBuffer s=new StringBuffer("Naveen Automation Labs");//synchronised,java class(inbuilt class)
System.out.println(s.reverse());
StringBuilder s1=new StringBuilder("Naveen Automation Labs");
System.out.println(s1.reverse());

	}

}
