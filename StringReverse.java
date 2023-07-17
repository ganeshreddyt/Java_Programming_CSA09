package javaAssignmentPgms;
import java.util.*;
import java.lang.*;

public class StringReverse {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner scan = new Scanner(System.in);
		
		// Input using string buffer
		StringBuffer str = new StringBuffer();
		
		System.out.print("Enter a charecter sequence: ");
		str.append(scan.nextLine());
		
		String ans = "";
	 	System.out.println("Actual string = " + str);
	 	
		// Basic approach 	 
		for(int i = str.length() - 1; i >= 0; i--) {  
			 // if i = 0 to len - 1 then ans = str.charAt(i) + ans;
			 ans += str.charAt(i);  
		}
		System.out.println("Basic approach output = " + ans);
		
		// Built in method
		System.out.println("Built in method output = " + str.reverse());
		
		
//		String Object Immutable - Return new object
//		String buffer/builder Mutable - Updates inplace	
		
//  1) charecter sequence char []str = {'j', 'a', 'v', 'a'}; str[index]..
//  2) string object String str = "java"; str.charAt(index)..

		 
		int num = 1234;
		StringBuffer sb = new StringBuffer();
		sb.append("" + num);
		
		System.out.println("Reverse num = " + sb.reverse());
        
//		System.out.println(1 + 2 + " Java"); op = 3 Java
//		System.out.println("Java " + 1 + 2); op = Java 12
			
	}

}
