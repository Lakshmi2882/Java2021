
public class PrintAlternativewords {

	public static void main(String[] args) {
		String str="LakshmiRadhika";
		String alt="";
		for(int i=1;i<str.length();i+=2)
		{
			alt=alt+str.charAt(i);
		}
		System.out.println(alt);

	}

}
