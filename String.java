package com.xworkz.praapp;

public class String {
	public static boolean values(String str, int n){
 
                for (int i = 0; i < n; i++) {
 
            
            if (!Character.isDigit(str.charAt(i))) {
                return false;
            }
        }
                  return true;
 
    }
                  
        public static void main(String args[])
                  {
                      
                      java.lang.String str = "independent";
                      int len = str.length();
               
                     
                      System.out.println(values(str, len));
                  }

		private static char[] values(java.lang.String str, int len) {
			// TODO Auto-generated method stub
			return null;
		}
              



	}
