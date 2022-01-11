package interviewroxorjava;

public class childclass extends parentclass {
//final keyword:
//	public static  void search(int price)
//	{
//		System.out.println("childclass");
//	}
	public childclass(int i)
	{ super();
		this.i=i;
		System.out.println("i value"+i);
	}
 public void search()
 {
	 System.out.println("child class search");
 }
	
	}


