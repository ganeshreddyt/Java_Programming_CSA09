package javaAssignmentPgms;
import java.util.*;

public class RandomNumber {

	public static void main(String[] i) {
		// TODO Auto-generated method stub
        
		// using rand class
		
		Random rand = new Random();
		int rand_num = rand.nextInt(1000);
		
		System.out.println(rand_num);
		
		// using math package
		System.out.println(Math.random());
		
		System.out.println(10 + 20 + " Java");
		System.out.println("Java " + 10 + 20);
		
		
	}

}
