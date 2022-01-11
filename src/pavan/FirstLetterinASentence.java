package pavan;

public class FirstLetterinASentence {

	public static void main(String[] args) {
		String sentence="My name is Lakshmi";
	String[] Words=	sentence.split(" ");
	for(String e:Words)
	{
		System.out.println(e.charAt(0));
	}
 
	}

}
