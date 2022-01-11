package javaprograms;

public class swapstrings {

	public static void main(String[] args) {
		String name1="Lakshmi";
		String name2="Radhika";
		String temp=name2;//R
		 name2=name1;//L
		 name1=temp;
		 System.out.println(name1);
		 System.out.println(name2);
		 System.out.println("without temparory");
		 //a=a+b;120,50,70
		 //b=a-b;50
		 //a=a-b;120-50=70
		 name1=name1.concat(name2);//LR
		 
		 System.out.println(name1);
		 name2=name1.replace(name2,"");
		 name1=name1.replace(name2,"");
		 System.out.println(name2);
		 System.out.println(name1);

	}
}

