package octoberjavainterviewquestions;

public class StaticBlockQuestion3 {
	int age;
	static
	{
		StaticBlockQuestion3 at1=new StaticBlockQuestion3 ();
		System.out.println(at1.age);
		
		
	}
	public static int createobject()
	{StaticBlockQuestion3 at2=new StaticBlockQuestion3 ();
		int age=40;
		return age;
		
	}
	
 private  StaticBlockQuestion3()
 {
	 age=30;
 }
 //we can use private variables and methods only with in the class
	public static void main(String[] args) {
		StaticBlockQuestion3 at=new StaticBlockQuestion3 ();
System.out.println(at.age);
	}
//How can we create an object if constructor is private?
}
