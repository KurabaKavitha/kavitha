package com.xworkz.collectionapp;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

public class ShoesSize {
	public static void main(String[] args) {
		int size1=11;
		int size2=13;
		int size3=30;
		int size4=32;
		int size5=34;
		int size6=36;
		int size7=38;
		int size8=2;
		int size9=4;
		int size10=6;
		int size11=5;
		int size12=7;
		int size13=8;
		int size14=9;
		int size15=10;
		Collection<Integer> shoes=new ArrayList<Integer>();
		
		shoes.add(size1);
		shoes.add(size2);
		shoes.add(size3);
		shoes.add(size4);
		shoes.add(size5);
		shoes.add(size6);
		shoes.add(size7);
		shoes.add(size8);
		shoes.add(size9);
		shoes.add(size10);
		shoes.add(size11);
		shoes.add(size12);
		shoes.add(size13);
		shoes.add(size14);
		shoes.add(size15);
		for(Integer element:shoes)
		{
			System.out.println(element);
		}
		System.out.println("*******Iterator*******");
		
		Iterator<Integer> itr=shoes.iterator();
		//using methods without knowing impl
		
		while(itr.hasNext())
		{
			Integer element=itr.next();
			System.out.println(element);
		}
		 
	}

}
