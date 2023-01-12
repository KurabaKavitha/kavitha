package com.xworkz.collectionapp;

import java.util.ArrayList;
import java.util.Collection;

public class Bike {
	
	public static void main(String[] args) {
		String bike1="Royal Enfield";
		String bike2="Yamaha";
		String bike3="Harley-Davidson";
		String bike4="KTM";
		String bike5="Suzuki";
		String bike7="TVS";
		String bike8="Ducati";
		String bike9="Kawasaki";
		String bike10="BMW";
		String bike11="Aprilia";
		String bike12="Bajaj Pulsar";
		String bike13="Bajaj CT 100";
		String bike14="Bajaj Avenger Cruise 220";
		String bike15="BMW M 1000RR";
		String bike16="Bajaj Chetak";
		String bike17="BMW R 18";
		String bike18="BMW C 400 GT";
		
		Collection b=new ArrayList<String>();
		b.add(bike18);
		b.add(bike17);
		b.add(bike16);
		b.add(bike15);
		b.add(bike14);
		
		
		int size = 25;
		System.out.println(b .size());
	
		b.clear();
		System.out.println("After the claer");
	System.out.println(b .size());

		
	}

}
