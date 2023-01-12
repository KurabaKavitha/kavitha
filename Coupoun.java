package com.xworkz.collectionapp;

import java.util.ArrayList;
import java.util.Collection;

public class Coupoun {
	
	public static void main(String[] args) {
		String coupoun1="Percentage -based coupons";
		String coupoun2="Fixed price";
		String coupoun13="BOGO";
		String coupoun4="Free shipping";
		String coupoun5="Advanced Shipping";
		String coupoun6="Automatic ";
		String coupoun7="Loyalty points";
		String coupoun8="GIftcards";
		String coupoun9="url ";
		String coupoun10="one-click";
		String coupoun11="Free gift with purchase";
		String coupoun12="After purchase";
		String coupoun131="Mystery";
		String coupoun14="Influencer";
		
		Collection c=new ArrayList<String>();
		c.add(coupoun14);
		c.add(coupoun131);
		c.add(coupoun12);
		
	
		
		int size = 14;
		System.out.println(c .size());
	
		c.clear();
		System.out.println("After the claer");
	System.out.println(c .size());

	}

}
