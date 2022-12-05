package com.xworkz.praapp.practice;

import java.util.Scanner;

public class Palindromenum {
	
	public static void main(String args[]) {
		int rev=0;
		int temp;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number");
		int num=sc.nextInt();
		int temp=num;
		
		while(num>0) {
			int rem=num%10;
			rev=rev*10+rem;
			num=num/10;
			
		}
		if(temp=rev) {
			System.out.println("palindrome number");
		}
		else {
			System.out.println("palindrome not number:");
			
			
		}
		
	}

}
