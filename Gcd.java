package javaBasicPgms1;

import java.util.*;

public class Gcd {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner input = new Scanner(System.in);
		
        System.out.print("Enter first number: ");
        int n1 = input.nextInt();
        System.out.print("Enter another number: ");
        int n2 = input.nextInt();
        
        // using Euclid's algorithm
        
        while(n2 != 0)
        {
        	int t = n1 % n2;
        	n1 = n2;
        	n2 = t; 
        }
        
        System.out.println("GCD = " + n1);
        
	}

}
