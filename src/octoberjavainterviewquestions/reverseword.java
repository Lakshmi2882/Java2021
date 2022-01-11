package octoberjavainterviewquestions;

public class reverseword {

	public static void main(String[] args) {
String str="my name is";
String[] str1=str.split(" ");

for(String e:str1)
{//my
	int j=e.length();//2,but array starts from 0
	
	String rev="";
	while(j>0)
	{
		char ch=e.charAt(j-1);
		rev=rev+ch;
		j--;
		
	}
	System.out.print(rev+" ");
}


	}

}
