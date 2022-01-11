package staticblock;

public class subclass extends superclass {
	int time=20;
	public void m1()
	{
		System.out.println("subclass" +time);
		System.out.println(super.time);
	}
}
