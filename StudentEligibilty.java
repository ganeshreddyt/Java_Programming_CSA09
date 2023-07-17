package javaAssignmentPgms;
import java.util.*;

public class StudentEligibilty {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int p, b, m, s, e;
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter marks in Physics: ");
		p = sc.nextInt();
		System.out.print("Enter marks in Biology: ");
		b = sc.nextInt();
		System.out.print("Enter marks in Maths: ");
		m = sc.nextInt();
		System.out.print("Enter marks in Science: ");
		s = sc.nextInt();
		System.out.print("Enter marks in English: ");
		e = sc.nextInt();
		
		int total = p + b + m + s + e;
		
		int []marks = {p, b, m, s, e};
		Arrays.sort(marks);
		
		System.out.println("Mean = " + total / 5);
		System.out.println("Median = " + marks[2]);
		float mode = (3 * marks[2]) - 2*(total / 5); // 3 median = 2 mean + mode ==> mode = 3 median - 2 mean
		System.out.println("Mode = " + mode);
	}

}
