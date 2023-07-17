package javaAssignmentPgms;
import java.util.*;
import java.util.Scanner;

public class SortStrings {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		System.out.print("Enter no.of names: ");
		int n = scan.nextInt();
		scan.nextLine();
		System.out.print("A/D or a/d: ");
		char ch = scan.next().charAt(0);
		scan.nextLine();
        String[] names = new String[n];
        
        System.out.println("Enter " + n + " strings: ");
        
        for(int i = 0; i < n; i++) 
        	names[i] = scan.nextLine();
        
        System.out.print("Before sorting: ");
        for(String name: names)
     	   System.out.print(name + " ");
       
       System.out.println();
       
       Arrays.sort(names); // built in method to sort an array default ascending order
       System.out.print("After sorting: ");
       
       if(ch == 'A' || ch == 'a') { 
          for(String name: names)
       	      System.out.print(name + " ");
       }
       else {
    	  for(int i = names.length - 1; i >= 0; i--) 
    		  System.out.print(names[i] + " ");
    	  
       }
       
       System.out.println();
       scan.close();
        
	}

}
