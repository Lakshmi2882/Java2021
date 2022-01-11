package octoberjavainterviewquestions;

public class findpercentagestring {

	public static void main(String[] args) {
		String str="Naveen Automation Labs 123 %#";
		int length=str.length();
		int ucount=0;
		int lcount=0;
		int dcount=0;
		int scount=0;
		for(int i=0;i<length-1;i++)
		{ char ch=str.charAt(i);
			if(Character.isUpperCase(ch))
			{
				ucount++;
			}
			else
			
				if(Character.isLowerCase(ch))
				{
					lcount++;
				}
				else
					if(Character.isDigit(ch))
					{
						dcount++;
					}
					else
					{
						scount++;
					}
		}
System.out.println("uppercase percentage:"+(ucount*100.0)/length);
System.out.println("lowercase percentage:"+(lcount *100.0)/length);
System.out.println("digits percentage:"+(dcount *100.0)/length);
System.out.println("special percentage:"+(scount *100.0)/length);
	}

}
