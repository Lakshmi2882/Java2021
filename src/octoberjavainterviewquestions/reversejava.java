package octoberjavainterviewquestions;

public class reversejava {

	public static void main(String[] args) {
		String str="";//4
		int l=str.length();
		System.out.println(l);
		String rev="";

for(int i=l-1;i>=0;i--)
{
	rev=rev+str.charAt(i);
}
System.out.println("reverse string is:"+rev);
	}

}
