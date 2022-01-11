package octoberjavainterviewquestions;

public class uppercasepercentage {

	public static void main(String[] args) {
		String str="Naveen Automation Labs 123 %#";
	char[]	ch=str.toCharArray();
		int length=ch.length;
		
		int count=0;
		int lcount=0;
		int scount=0;
		int dcount=0;
		
		for(int i=0;i<length-1;i++)
		{ 
			if(ch[i]>='A'&&ch[i]<='Z')
			{
				count++;
			}
			else
				if(ch[i]>='a'&&ch[i]<='z')
				{
					lcount++;
				}
				else
					if(ch[i]>='1'&&ch[i]<='9')
					{
						dcount++;
					}
					else
					{
						scount++;
				}
		}
	int cp=(count*100)/length;
	System.out.println("uppercase:"+ cp);
	System.out.println("lower case:"+(lcount*100.0)/length);
	System.out.println("digits:"+(dcount*100)/length);
	System.out.println("special"+(scount*100)/length);
	}
	
}


