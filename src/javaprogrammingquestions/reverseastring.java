package javaprogrammingquestions;

public class reverseastring {

	public static void main(String[] args) {
		String company="My company is Amedus";
		String rev="";
		for(int i=company.length()-1;i>=0;i--)
		{
			rev=rev+company.charAt(i);
		}
		System.out.println(rev);

	}

}
