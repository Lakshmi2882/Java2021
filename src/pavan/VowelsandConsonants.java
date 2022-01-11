package pavan;

public class VowelsandConsonants {

	public static void main(String[] args) {
		String name="Radhikaa";
		int vowels=0;
		int consonants=0;
		for(int i=0;i<name.length();i++)
		{
			if(name.charAt(i)=='a'||name.charAt(i)=='e'||name.charAt(i)=='i'||name.charAt(i)=='o'||name.charAt(i)=='u')
			{
				vowels=vowels+1;;
			}
			else
			{
				consonants=consonants+1;
			}
		}
		System.out.println("vowels are:"+vowels);
		System.out.println("consonants are:"+consonants);

	}

}
