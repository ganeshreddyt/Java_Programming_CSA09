package javaBasicPgms1;
import java.util.*;
public class vote {
	public static void main(String[]args) {
		int a,shrt;
		System.out.print("Enter the age:");
		Scanner sc = new Scanner(System.in);
		a=sc.nextInt();
		
		if(a>=18)
		{
			System.out.print("person is eligible to vote");
		}
		else
		{
			shrt=(18-a);
			System.out.print("person is eligible to vote:");
		}
		
	}

}
