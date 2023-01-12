package com.xworkz.collectionapp;

import java.util.ArrayList;
import java.util.Collection;

public class Sweets {
	
	public static void main(String[] args) {
		String sweet1="Gulab Jamun";
		String sweet2="Jalebi";
		String sweet3="Kheer";
		String sweet4="Shrikhand";
		String sweet5="patishapta";
		String sweet6="Gajar ka Halwa";
		String sweet7="Rasmalai";
		String sweet8="Ghevar";
		String sweet9="Rasgulla";
		String sweet10="Ladoo";
		String sweet11="Mysore pak";
		String sweet12="Khaja";
	
		Collection c=new ArrayList<String>();
		c.add(sweet1);
		c.add(sweet12);
		c.add(sweet11);
		c.add(sweet10);
		c.add(sweet10);
		c.add(sweet9);
		c.add(sweet8);
		c.add(sweet7);
		c.add(sweet6);
		c.add(sweet5);
		c.add(sweet4);
		

		int size = 12;
		System.out.println(c .size());
		
	

	c.clear();
	System.out.println(c .size());
	}
}
