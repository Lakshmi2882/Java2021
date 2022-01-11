package octoberjavainterviewquestions;

public class StaticBlockQuestions {
 
	static {
		System.out.println("static block");
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
System.out.println("main method");
	}
	//1. JVM will execute static block first
	//2. it will execute main method second
//we can have n number of static blocks
}
