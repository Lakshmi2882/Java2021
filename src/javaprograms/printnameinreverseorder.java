package javaprograms;

public class printnameinreverseorder {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String myname="swarajEddanapudi";
		String revname="";
		for(int i=myname.length()-1;i>=0;i--)
		{
			
			revname=revname+myname.charAt(i);
		
		}
		System.out.println(revname);

	}

}
