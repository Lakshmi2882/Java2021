package interviewroxorjava;

public class trycatchwithoutcatch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try
		{
		int i=9/0;
		System.out.println(i);
		}
		finally
		{
			System.out.println("thereis an Arithemetic exception");
		}
		

	}

}
