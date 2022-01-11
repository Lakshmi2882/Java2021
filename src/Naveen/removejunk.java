package Naveen;

public class removejunk {

	public static void main(String[] args) {
		String exp="££££££radhi**ka!!";
		String exp1="    java    programming";
		//Regular expression[A-Z,a-z,0-9]
String s=exp.replaceAll("[^a-zA-Z0-9]", "");
String s1=exp1.replaceAll("[^a-zA-Z0-9]", "");
System.out.println(s);
System.out.println(s1);
		for(int i=0;i<exp.length();i++)
		{
			
		}

	}

}
