package com.xworkz.collectionapp;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

public class Animals {
	
	public static void main(String[] args) {
		 String animal1="Dog";
		 String animal2="cat";
		 String animal3="tiger";
		 String animal4="lion";
		 String animal5="Fox";
		 String animal6="Elephant";
		 String animal7="pig";
		 String animal8="frog";
		 String animal9="goat";
		 String animal10="sheep";
		 
		 Collection<String> Animals=new ArrayList<String>();
		 
		 Animals.add(animal1);
		 Animals.add(animal2);
		 Animals.add(animal3);
		 Animals.add(animal4);
		 Animals.add(animal5);
		 Animals.add(animal6);
		 Animals.add(animal7);
		 Animals.add(animal8);
		 Animals.add(animal9);
		 Animals.add(animal10);
		 for(String element:Animals)
			{
				System.out.println(element);
			}
			System.out.println("*******Iterator*******");
			
			Iterator<String> itr=Animals.iterator();
			//using methods without knowing impl
			
			while(itr.hasNext())
			{
				String element=itr.next();
				System.out.println(element);
			}
	}

}
