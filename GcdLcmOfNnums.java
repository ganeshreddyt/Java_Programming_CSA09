package javaBasicPgms1;
import java.util.*;

public class GcdLcmOfNnums {
	
	public static int euclidsGCD(int n1, int n2) {
		
	// To find out Gcd using Euclid's theorem  
      while(n2 != 0){
    	int t = n1 % n2;
    	n1 = n2;
    	n2 = t; 
      }
      
    return n1;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		
		System.out.print("Enter no.of elements: ");
		int n = scan.nextInt();
 
		int[] number = new int[n];
		
		for(int i = 0; i < n; i++) {
			number[i] = scan.nextInt();
		}
		
		int gcd = 1, lcm = 1;
		
		for(int i = 0; i < n; i++) {
			gcd = euclidsGCD(gcd, number[i]);
			lcm = (lcm * number[i]) / gcd;
			//System.out.println(gcd + " " + lcm);
		}
	 
		System.out.print("Data = ");
		
		for(int x: number)
			System.out.print(x + " ");
		
		System.out.print("Gcd = " + gcd);
		System.out.print("Lcm = " + lcm);
		

	}

}
