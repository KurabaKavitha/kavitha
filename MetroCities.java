package com.xworkz.collectionapp;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

public class MetroCities {
	
	public static void main(String[] args) {
		String name1="Mumbai";
		String name2="Bengaluru";
		String name3="Chennai";
		String name4="Hyderabad";
		String name5="Kolkata";
		Collection<String> Metrocities=new ArrayList<String>();
		
		Metrocities.add(name5);
		Metrocities.add(name4);
		Metrocities.add(name3);
		Metrocities.add(name2);
		Metrocities.add(name1);
		
		for(String element:Metrocities)
		{
			System.out.println(element);
		}
		System.out.println("*******Iterator*******");
		
		Iterator<String> itr=Metrocities.iterator();
		//using methods without knowing impl
		
		while(itr.hasNext())
		{
			String element=itr.next();
			System.out.println(element);
	}

	}
}
