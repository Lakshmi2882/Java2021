package Naveen;

import java.util.Random;
import java.util.concurrent.ThreadLocalRandom;

public class generateRandomNumber {

	public static void main(String[] args) {
		Random random=new Random();
		System.out.println("print random integer:"+random.nextInt());
		System.out.println("print random double:"+random.nextDouble());
		System.out.println("print random boolean:"+random.nextBoolean());
		System.out.println("print random float:"+random.nextFloat());
		System.out.println("----------------");
		for(int i=1;i<=5;i++)
		{
			System.out.println("print random integer:"+random.nextInt());
			System.out.println("print random double:"+random.nextDouble());
			System.out.println("print random boolean:"+random.nextBoolean());
			System.out.println("print random float:"+random.nextFloat());
		}
		System.out.println("----------------");
		System.out.println("print random:"+Math.random());
		System.out.println("--------------------");
		System.out.println(ThreadLocalRandom.current().nextDouble());
		System.out.println(ThreadLocalRandom.current().nextFloat());
		System.out.println(ThreadLocalRandom.current().nextInt());
		System.out.println(ThreadLocalRandom.current().nextBoolean());
		System.out.println("....range....");
		for(int i=1;i<=5;i++)
		{
		System.out.println(random.nextInt(3));//0 to 3
		}
		for(int i=1;i<=5;i++)
		{
			//System.out.println((int)(Math.random()*5));//*5 is taking numbers from 0 to5
			System.out.println(ThreadLocalRandom.current().nextInt(0,5));
		}
	}
	

}
