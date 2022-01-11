package javaprograms;

public class duplicatearray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String Array[]= {"java","Ruby","phython","java","ruby"};
		for(int i=0;i<Array.length;i++)
		{ for(int j=i+1;j<Array.length;j++)
			if(Array[i].equalsIgnoreCase(Array[j]))
			{
			System.out.println(Array[i]);
			}
		}
		

	}

}
