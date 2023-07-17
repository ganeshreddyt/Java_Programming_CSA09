
import java.util.*;

public class OrderByFrequency {
	
	public static void main(String[] args) {
		
		int[] data = {1, 2, 1, 4, 3, 3, 2, 5, 3, 3};
		HashMap<Integer, Integer> mp = new HashMap<Integer, Integer>();
		
		for(int i: data) {
			if(mp.containsKey(i))
				mp.put(i, mp.get(i) + 1);
			else
				mp.put(i, 1);
		}
		
		HashMap<Integer, SortedSet<Integer>> mp2 = new HashMap<Integer, SortedSet<Integer>>();
		
		mp.forEach(
				(key, val)->{
					  if(mp2.containsKey(val)) mp2.get(val).add(key);
					  else {
						  SortedSet<Integer> t = new TreeSet<Integer>();
						  t.add(key);
						  mp2.put(val, t);
					  }
					 System.out.println(key + " ->" + val);
				});
		
		System.out.println("\n");
		
		mp2.forEach(
				(key, val)-> System.out.println(key + " ->" + val)
				);
		 
		
	}

}
