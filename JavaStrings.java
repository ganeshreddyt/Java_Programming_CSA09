package javaStrings;

import java.util.*;

public class JavaStrings {

	public static void favPlace(String placeName) {
		System.out.println("\nI am from function :" + placeName);

		placeName = "thirupthi";
		return;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        System.out.println("Hello world");
//        
////        what it might be shared when an array is intiliazed to another variable
////        by using "=" operator
//        
//        int[] arr1 = {10, 20, 30};
//        System.out.println();
//        
////        print array content using for ach loop
//        for(int val : arr1) {
//        	System.out.print(val + ", ");
//        }
//        
//        int[] arr2 = arr1;
//         
//        arr1[0] = 20;  // becasuse arrays are mutable
//        System.out.println();
//        
////      print array content using for ach loop
//      for(int val : arr2) {
//      	System.out.print(val + ", ");
//      }
//        
//      arr2[0] = 21;
/*//      System.out.println();
//      
////    print array content using for ach loop
//    for(int val : arr1) {
//    	System.out.print(val + ", ");
//    }
*///    
      String vil1 = "thamballapalle";
           String vil2 = "thamballapalli"; // 'i'- false  , 'e'- true  
      
      System.out.println(vil1 == vil2);
      
      vil1 = "madanapalle";   // here it creats new object instead 
      // using old memory allocated for pre data
      
      System.out.print(vil1 + " " + vil2);
      
      favPlace(vil2); // intially it has value = "thamballapalli" 
      
      // print after updated in the function
       System.out.println(vil2);
      
	}

}
