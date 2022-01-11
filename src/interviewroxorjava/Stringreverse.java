package interviewroxorjava;

public class Stringreverse {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		String name="Radhika";
//		
//int length=name.length();
//String rev="";
//for(int i=length-1;i>=0;i--)
//{
//	rev=rev+name.charAt(i);
//}
//System.out.println(rev);
		StringBuffer name=new StringBuffer("Radhika");
	StringBuffer reverse=	name.reverse();
	System.out.println(reverse);

	}

}
