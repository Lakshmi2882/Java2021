package Naveen;

public class RDSECONDOCCURNCE {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String name="December";
		int count=1;
	char ch[]=	name.toCharArray();
	for(int i=0;i<ch.length;i++)
	{
		if(ch[i]==ch[i+1])
		{
			count++;
		}
		System.out.println(count);
	}

	}

}
