package com.xworkz.praapp.swapnum;

import java.util.Scanner;

public class Swap {
	
	public static void main(String args[]) {
	
	int x;
	int y;
	int t;
	
	Scanner sc= new Scanner(System.in);
	System.out.println("Enter the values of x and y");
	x=sc.nextInt();
	y=sc.nextInt();
	t=x;
	x=y;
	y=t;
	System.out.println("swapping:"+x +" " + y);
	}
}
	
	
	
	

