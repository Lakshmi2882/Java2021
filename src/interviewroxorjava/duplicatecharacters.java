package interviewroxorjava;

public class duplicatecharacters {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s="Lakshmiaa";
		for(int i=0;i<s.length()-1;i++)
		{
			if(s.charAt(i)!=s.charAt(i+1))
			{
				System.out.print(s.charAt(i));
				
			}
		}
		

	}

}
