package com.xworkz.praapp.practice;

import java.util.Scanner;

public class PaliString {
	
	public static void main(String args[]) {
		String original,reverse="independent";
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number:");
		original=sc.nextLine();
		int length=original.length();
		for(int i=length-1;i>=0;i--) {
			reverse=reverse+original.charAt(i);
			
		}
		if(original.equals(reverse)) {
			System.out.println("Enter String is a palindrome");
		}
		else {
			System.out.println("Enter String is not a palindrome:");
		}
			
		
		
		
	}

}
