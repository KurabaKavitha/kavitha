package com.xworkz.praapp.practice;

import java.util.Scanner;

public class Palindrome {
	
	public static void main(String args[]) {
		String a,b;
		StringBuffer sb;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the string is a palindrome:");
		a=sc.nextLine();
		sb=new StringBuffer(a);
		b=sb.reverse().toString();
		if(a.equals(b)) {
			System.out.println(" the String is a palindromre:");
		}
		else {
			System.out.println("the String is not a palindrome:");
		}
		
		
	}

}
