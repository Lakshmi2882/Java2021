
public class FindUnicode {

	public static void main(String[] args) {
	char ch='x';
	int key=2;
	String v= Integer.toHexString(ch);
	//int v=Character.getType(ch)+key;
	int u=Integer.parseInt(v)+key;
	char c=(char)u;
	System.out.println(c);
//	if(v<=122)
//	{
//		System.out.println((char)v);
//	}
//	else
//	{
//		System.out.println((char)((96+v)%122));
//
//	}

}
}
