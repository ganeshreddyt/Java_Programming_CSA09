package javaBasicPgms1;

public class PatternPgms {

   public static void main(String[] args) {
	
	   // right triangle....
	   
	  for(int i=1;i<=5;i++)
	  {
		  for(int j=1;j<=i;j++)
		  {
			  System.out.print("* ");
		  }

		  System.out.println();
	  }
	  
	  // inverted right triangle
	  
	  for(int i=3;i>=0;i--)
	  {
		  for(int j=1;j<=4;j++)
		  {
			  System.out.print("* ");
		  }
		  System.out.println();
	  }
	  
	   
    }

}
