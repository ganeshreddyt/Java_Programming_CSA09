package javaAssignmentPgms;
import java.util.*;

public class NthFactor {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
      
		int n = 10;
		ArrayList<Integer> factors = new ArrayList<Integer>();
		
		for(int i = 1; i <= n; i++) {
			if(n % i == 0)
				factors.add(i);
		}
		
		System.out.println(factors);
		
		int nthFactor = 3;
		if(factors.size() < nthFactor) System.out.println("Factor's are less than " + nthFactor);
		else System.out.println(nthFactor + "th factor: " + factors.toArray()[nthFactor - 1]);

	}

}
