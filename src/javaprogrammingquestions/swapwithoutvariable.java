package javaprogrammingquestions;

public class swapwithoutvariable {

	public static void main(String[] args) {
		float a=0.5f;
		float b=0.6f;
		b=a+b;
		a=b-a;
		b=b-a;
		System.out.println(a);
		System.out.println(b);

	}

}
