package com.xworkz.praapp;

import java.util.Scanner;

public class Duplicate {
	
	public static void main(String args[]) {
		int arr[]=new int[50];
		int n;
		int i,j,k;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter array size");
		n=sc.nextInt();
		System.out.println("Enter"+n+"array");
		for(i=0;i<n;i++) {
			arr[i]=sc.nextInt();
		}
		System.out.println("Array");
		for(i=0;i<n;i++) {
			System.out.println(arr[i]+"");
		}
		//find and remove duplicates
		for(i=0;i<n;i++) {
			for(j=i+i;j<n;) {
				if(arr[j]==arr[i]) {
					for(k=j;k<n;k++) {
						arr[k]=arr[k+1];
					}
					n--;
				}
				else {
					j++;
				}
			}
		}
		System.out.println("Remove the duplicate values");
		for(i=0;i<n;i++) {
			System.out.println(arr[i]+"");
		}
	}

}
