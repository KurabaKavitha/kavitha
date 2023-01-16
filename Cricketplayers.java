package com.xworkz.map;

import java.util.TreeMap;

import com.sun.javafx.collections.MappingChange.Map;

public class Cricketplayers {
	public static void main(String[] args) {
		
		TreeMap<String,Double> map=new TreeMap<String,Double>((n,m)->n.compareTo(m));
		map.put("virat", 325000D);
		map.put("dhoni", 425000D);
		map.put("xyz", 525000D);
		map.put("abc", 625000D);
		map.put("zxc", 250000D);
		map.forEach((n,m)->System.out.println(n+" "+m));
		map.forEach((n,m)->{System.out.println("--");if(m<425000) {map.remove(n);
		System.out.println(n+" "+m);}});
	}

	}


