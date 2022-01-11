package octoberjavainterviewquestions;

public class HowmanyStringobjectswillbecreated {

	public static void main(String[] args) {
//How many string objects will be created?
		//2
		//because object is created in Heap and the object is created in string pool and n1 is pointing to the object
		String n1=new String("Hello World");
		System.out.println(n1);
		String n2=new String("Hello World");
		//in this object is only created in  Heap and n2 is pointing to same object in string pool
		System.out.println(n2);

	}

}
