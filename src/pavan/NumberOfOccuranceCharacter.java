package pavan;

public class NumberOfOccuranceCharacter {

	public static void main(String[] args) {
	System.out.println(  Occurance("Radhika",'h'));

	}
	public static int Occurance(String str1,char c)
	{ int count=0;
		for(int i=0;i<str1.length();i++)
		{
			if(str1.charAt(i)==c)
			{
				count=count+1;
			}
		}
		return count;
	}

}
