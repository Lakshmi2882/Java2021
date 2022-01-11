package javaprograms;

public class stringlength {

	public static void main(String[] args) {
		String name="Radhika";
		System.out.println(name.toCharArray().length);
		System.out.println(name.lastIndexOf(""));
		int length=0;
	for(char e:name.toCharArray())
	{
		length=length+1;
				
	}
	
System.out.println(length);
	}

}
