package com.xworkz.praapp;

import java.util.Scanner;

public class Reverse {
	
	public static void main(String args[]) {
		int a = 125480541 ,b;
		int d=0;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number");
		
		while(a>0) {
			b=a%10;
			a=a/10;
			d=(d*10)+b;
		}
		System.out.print("reverse is:"+d);
	
		
	}

}
