package javaprograms;

public class countvowels {

	public static void main(String[] args) {
		String name="my name is swaraj";
		int count=0;
		for(int i=0;i<name.length();i++)
		{
		char c=name.charAt(i);
		
		if(c=='a'||c=='e'||c=='i'||c=='o'||c=='u')
		{
			count=count+1;
		}
	}
		System.out.println(count);
	}
}
