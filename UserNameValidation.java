package javaAssignmentPgms;

import java.util.*;

public class UserNameValidation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner scan = new Scanner(System.in);
		
		System.out.print("Enter user id: ");
		String str1 = scan.nextLine();
		
		System.out.print("Re-enter user id: ");
		String str2 = scan.nextLine();
		
		// using ternary operator username validation.....
		String ans = str1.compareTo(str2) == 0 ? "Valid credentials!.." : "Invalid credentials!...";
		
		System.out.println(ans);

	}

}
