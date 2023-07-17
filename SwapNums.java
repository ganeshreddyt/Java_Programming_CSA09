package javaBasicPgms1;

public class SwapNums {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        
		int a = -10;
		int b = 20;
		
		// using extra variable
		int temp = a;
		a = b;
		b = temp;
		
		System.out.println("After swapping: " + a + " "+ b);
		
		// without using extra variable
		a = a + b;
		b = a - b;
		a = a - b;
		
		System.out.println("After swapping: " + a + " "+ b);
		
		
	}

}
