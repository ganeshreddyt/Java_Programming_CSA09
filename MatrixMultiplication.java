import java.util.*;

public class MatrixMultiplication {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		
	    int row1 = 2, col1 = 3, row2 = 3, col2 = 2;
	    
	    int[][] m1 = new int[row1][col1], m2 = new int[row2][col2];
        
	     System.out.print("Enter elements for matrix 1: ");
	     
	     for(int i = 0; i < row1; i++) {
	    	 for(int j = 0; j < col1; j++) {
	    		 m1[i][j] = sc.nextInt();
	    	 }
	     }
	     
         System.out.print("Enter elements for matrix :2 ");
	     
	     for(int i = 0; i < row2; i++) {
	    	 for(int j = 0; j < col2; j++) {
	    		 m2[i][j] = sc.nextInt();
	    	 }
	     }
	     
     System.out.println("Multiplication of matrix 1 and matrix 2:  ");
	     
	     for(int i = 0; i < row1; i++) {
	    	 for(int j = 0; j < col2; j++) {
	    		  int sum = 0;
	    		  for(int k = 0; k < col1; k++) {
	    			  sum += (m1[i][k] * m2[k][j]);
	    		  }
	    		  System.out.print(sum + " ");
	    	 }
	    	 System.out.println();
	     }
	  
	     

	}

}
