package javaprograms;

public class countcapitilaziedwords {

	public static void main(String[] args) {
		String name="Naveen Automation Labs";
		int count=0;
		for(int i=0;i<name.length();i++)
		{   if( name.charAt(i)>='A'&&(name.charAt(i)<='Z'))
		{
			count=count+1;
		}
			
		}
System.out.println(count);
//2nd way 
int total=0;
	for(int i=0;i<name.length();i++)
	{
		if(Character.isUpperCase(name.charAt(i)))
		{
			total=total+1;
		}
	}
	System.out.println(total);
	//3rd way:using streams
	
long count1=	name.chars().filter(e-> e>=65 && e<=90).count();
	System.out.println(count1);
	}
	

}
