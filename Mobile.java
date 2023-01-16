package com.xworkz.map;

import java.util.Map;
import java.util.TreeMap;





public class Mobile {
	
	public static void main(String[] args) {
		Map<String,Double> MobileMap=new TreeMap<String,Double>();
		MobileMap.put("Apple",(double) 150000);
		MobileMap.put("redmi",(double) 18000);
		MobileMap.put("samsung",(double) 23000);
		MobileMap.put("oppo",(double) 15000);
		MobileMap.put("vivo",(double) 21000);
		MobileMap.put("oneplus",(double) 18000);
		MobileMap.put("Vivo y22",(double) 16499);
		MobileMap.put("Xiaomi mi 12s",(double) 97999);
		MobileMap.put("oppo k3",(double) 6500);
		MobileMap.put("Redmi note 10",(double) 9999);
		System.out.println(MobileMap.size());
		
		MobileMap.forEach((n,m)->System.out.println(n+" "+m));
		System.out.println("print in upper case");
		MobileMap.forEach((n,m)->{System.out.println(n.toUpperCase()+" "+m);});
		MobileMap.forEach((n,m)->{System.out.println("============"); if(m>25000) {System.out.println(n+" "+m);}});
		
		System.out.println("key is less than 5");
		MobileMap.forEach((n,m)->{System.out.println("==="); if(n.length()<5) {
			System.out.println(n+" "+m);};
		});
		
	}

}
