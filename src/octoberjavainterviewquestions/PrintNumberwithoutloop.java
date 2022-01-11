package octoberjavainterviewquestions;

public class PrintNumberwithoutloop {
//Recursive way
	public static void main(String[] args) {
		printNum(-1);
		printNum(100);
		printNum(200,500);

	}
 public static void printNum(int num)
 {
	 if(num<=100)
	 {
		 System.out.println(num);
		 num=num+1;
		 printNum(num);
	 }
 }
 public static void printNum(int stnum, int endnum)
 {
	 if(stnum<=endnum)
	 {
		 System.out.println(stnum);
		 stnum++;
		 printNum(stnum,endnum);
	 }
 }
}
