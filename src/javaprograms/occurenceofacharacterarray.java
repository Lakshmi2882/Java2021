package javaprograms;

public class occurenceofacharacterarray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
 String s="javaa programming language";
 int length=s.length();
 int removea=s.replaceAll("a","").length();
 int nowlength=length-removea;
 System.out.println(nowlength);
	}

}
