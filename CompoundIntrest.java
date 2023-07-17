package javaBasicPgms1;

import java.util.Scanner;

public class CompoundIntrest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        
		Scanner input = new Scanner(System.in);
		
		System.out.print("Enter principle amount: ");
		double p = input.nextFloat();
		System.out.print("Enter time period: ");
		double t = input.nextFloat();
		System.out.print("Enter intrest rate: ");
		double i= input.nextFloat();
		System.out.print("Enter no.of periods/year(default 12): ");
		double n = input.nextFloat();
		
		double ci = p * Math.pow((1 + i / n), n * t);
		
		System.out.println("Compound Intrest: " + ci);
		
		System.out.println();
	}

}
