package com.xworkz.praapp;

import java.util.Scanner;

public class SquareRoot {

		public static void main(String args[])    
	{   
	System.out.print("Enter a number: ");   
	Scanner sc = new Scanner(System.in);   
	int n = sc.nextInt();  
	//calling the method  
	System.out.println("The square root of "+ n+ " is: "+squareRoot(n));  
	}

		private static double squareRoot(int n) {
			// TODO Auto-generated method stub
			double t;  
			int num = 12;
			double sqrtroot=num/2;  
			do   
			{  
			t=sqrtroot;  
			sqrtroot=(t+(num/t))/2;  
			}   
			while((t-sqrtroot)!= 0);  
			return sqrtroot;  

		}  

}
