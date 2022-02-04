import java.util.Scanner;

public class validPhoneno {

	public static void main(String[] args) {
	
Scanner in=new Scanner(System.in);
System.out.println("enter valid no");
String s1=in.nextLine();
if(s1.matches("[0-9]{3}{-}{1}[0-9]{3}{-}{1}[0-9]{4}"))
		{
	System.out.println("valid phoneno");
		}
else
{
	System.out.println("not valid phoneno");
}

	}

}
