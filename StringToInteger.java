package javaAssignmentPgms;

public class StringToInteger {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        
		String strNumber = "123456";
		
		long number = 0;
		
		// without built in method
		for(int i = 0; i < strNumber.length(); i++) 
			number = number * 10 + strNumber.charAt(i) - '0';
	
		System.out.println(number + 10);
		
		
		// using built in method
		strNumber = "123456";
		System.out.println(Integer.parseInt(strNumber) + 10);
		 
	}

}
