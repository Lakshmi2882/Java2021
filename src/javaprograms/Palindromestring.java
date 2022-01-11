package javaprograms;

public class Palindromestring {

	public static void main(String[] args) {
 String name="Radhika";
 String reverse=" ";
 for(int i=name.length()-1;i>=0;i--)
 {
	reverse=reverse+name.charAt(i);
 }
 System.out.println(reverse);
 String name1=name;
 if(reverse.equals(name1))
 {
	 System.out.println("String is not reversed");
 }
 else
 {
	 System.out.println("String is reversed");
 }
	}

}
