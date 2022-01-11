package javaprograms;

public class removewhitespaces {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String sentence="java  programming  language";
sentence=	sentence.replaceAll("\\s","");
	System.out.println(sentence);
	}

}
