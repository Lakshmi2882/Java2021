package javaprograms;

public class checkstringispresent {

	public static void main(String[] args) {
		
	System.out.println(isstringmatches("My name is Lakshmi Radhika","Lakshmi"));
	System.out.println(isstringmatches("My name is Lakshmi Radhika","  "));
	}
 public static boolean isstringmatches(String name,String sub)
 {
	 return name.matches("(.*)"+sub+"(.*)");
 }
}
