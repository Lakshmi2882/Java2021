package javaprograms;

public class findduplicatearray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
String[] languages= {"ruby","python","java","ruby","java","java"};
for(int i=0;i<languages.length;i++)
{
	for(int j=i+1;j<languages.length;j++)
	{
		if(languages[i].equals(languages[j]))
		{
			System.out.println(languages[i]);
		}
	}
}
	}

}
