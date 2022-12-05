package com.xworkz.praapp;

public class SecondLargestinArray {
	
	
	
	public static int getSecondLargest(int[] a1, int total) {  
			int temp;  
			for (int i = 0; i < total; i++)   
			        {  
			            for (int j = i + 1; j < total; j++)   
			            {  
			                if (a1[i] > a1[j])   
			                {  
			                    temp = a1[i];  
			                    a1[i] = a1[j];  
			                    a1[j] = temp;  
			                }  
			            }  
			        }  
			       return a1[total-2];  
			}  
		public static void main(String args[]) {
			int a[]={1,2,5,6,3,2};  
			int b[]={44,66,99,77,33,22,55};  
			System.out.println("Second Largest: "+getSecondLargest(a,6));  
			System.out.println("Second Largest: "+getSecondLargest(b,7)); 
		}


		}


