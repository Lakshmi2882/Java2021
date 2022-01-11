package javaprograms;

public class countdigitsspecialcharaxtersandvowelsaonsonants {

	public static void main(String[] args) {
		String emailid=" sbharadwaj06@gmail.com";
		int digits=0;
		int sc=0;
		int consonants=0;
		int vowels=0;
		for(int i=0;i<emailid.length();i++)
		{
			char ch=emailid.charAt(i);
			if((ch>='A'&&ch<='Z')||(ch>='a'&&ch<='z'))
			{
				ch=Character.toLowerCase(ch);
				if(ch=='a'||ch=='e'||ch=='i'||ch=='o'||ch=='u')
				{
					vowels=vowels+1;
				}
				else
				{
					consonants=consonants+1;
				}
			}
		}
		System.out.println("vowels are:"+vowels);
		System.out.println("consonants are:"+consonants);
	}
}