package octoberjavainterviewquestions;

public class reversesentence {

	public static void main(String[] args) {
		String str="My name is radhika";
		//output : radhika is name my
	String[] str1=	str.split(" ");
	for(int i=str1.length-1;i>=0;i--)
	{
		System.out.print(str1[i]+" ");
	}

	}

}
