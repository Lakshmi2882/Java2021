package pavan;

public class FinalizeConcept {

	public static void main(String[] args) {
		FinalizeConcept obj=new FinalizeConcept();
		obj=null;
		System.gc();//garbage collector
		System.out.println("Bye");

	}
	@Override
	public void finalize()
	{
		System.out.println("finalize method");//jvm will call this method
	}

}
