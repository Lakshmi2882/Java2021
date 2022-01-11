package octoberjavainterviewquestions;

public class staticblockquestion5 {
//can we initialise member variables with in static class
	//Ans:yes
	 int i;
	 static int age;
	static
	{  staticblockquestion5 block=new staticblockquestion5();
	block.i=45;
	System.out.println(block.i);
	age=30;
	System.out.println(age);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
