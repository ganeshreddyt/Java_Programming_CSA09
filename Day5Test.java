package javaAssignmentPgms;

public class Day5Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// Q1) Count no.of elements in an array
		
		int []arr = {12, 89, 3, -12, -34, 1, 0}; int cnt = 0;
		
		for(int item: arr)
		    cnt++;
		
		System.out.println("total items(using for loop) = " + cnt);
		System.out.println("total items(built in method) = " + arr.length);
		
		
		// Q2) Cal square root of a number
		// Approach :- Using binary search
		
		double num = 4;
		
		double i = 1.0f;
		double j = num / 2, mid = 0.0;
		
		while(i <= j) {
			
			mid = (i + j) / 2;
			
			if(Math.abs(num - (mid * mid)) <= 0.00001 || num - (mid * mid) == 0)
				 break;
			
			else if(mid * mid < num)
				i = mid + .001;
			else
				j = mid - .001;
		}
		
		System.out.println("sqrt of(using binary search) " + num + " = " + mid);
		System.out.println("sqrt of(using built in method) " + num + " = " + Math.sqrt(num));   
		
	}

}
