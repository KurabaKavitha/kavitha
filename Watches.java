package com.xworkz.collectionapp;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;



public class Watches {

	public static void main(String[] args) {
		
		String watch1="sonato";
		String watch2="fastrack";
		String watch3="noise";
		String watch4="Titan";
		String watch5="fire-bolt";
		
		Collection<String> watches=new ArrayList<String>();
		watches.add(watch1);
		watches.add(watch5);
		watches.add(watch4);
		watches.add(watch3);
		watches.add(watch2);
		
		for(String element:watches)
		{
			System.out.println(element);
		}
		System.out.println("*******Iterator*******");
		
		Iterator<String> itr=watches.iterator();
		//using methods without knowing impl
		
		while(itr.hasNext())
		{
			String element=itr.next();
			System.out.println(element);
		}
		
	}

}
