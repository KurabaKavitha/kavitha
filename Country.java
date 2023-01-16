package com.xworkz.map;

import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;
import java.util.function.BiConsumer;

public class Country {
	public static void main(String[] args) {
		
		Map<String, String> countrypresidentMap=new TreeMap<String,String>((n,m)->m.compareTo(n));
		countrypresidentMap.put("India", "Ramnath kovind");
		countrypresidentMap.put("America" , "Jeo Biden");
		countrypresidentMap.put("Bangladesh", "Abul Hamid");
		countrypresidentMap.put("China", "Xi Jinping");
		countrypresidentMap.put("South lorea", "Moon jae in");
		countrypresidentMap.put("Isaac", "Isacc Herzog");
		countrypresidentMap.put("Srilanka", "Dinesh Gunawardene");
		countrypresidentMap.put("Pakistan", "Shahbaz sharif");
		countrypresidentMap.put("Colombia", "Gustavo Petro");
		countrypresidentMap.put("Japan", "Fumio Kishida");
		countrypresidentMap.put("Guinea", "James Marpe");
		countrypresidentMap.put("France", "Elizabeth Bourne");
		countrypresidentMap.put("Ukraine", "Volodymyr Zelenskyy");
		countrypresidentMap.put("Russia", "Vladimir putin");
		countrypresidentMap.put("canada", "Justin Trudeau");
		countrypresidentMap.put("Italy", "Sergio MattaMattarella");
		countrypresidentMap.put("Iran", "Hassan Rouhani");
		countrypresidentMap.put("Indonesia", "Joko Widodo");
		countrypresidentMap.put("Turkey", "Recep tayyip");
		countrypresidentMap.put("Myanmar", "Myint Swe");
		
		boolean contains= countrypresidentMap.containsKey("Isaac");
		System.out.println("contains Isaac"+contains);
		
		boolean containsValue=countrypresidentMap.containsValue(String.class);
		System.out.println("containsValue"+containsValue);
		countrypresidentMap.forEach((n,m)->System.out.println(n+" "+m));
		System.out.println("update the presidante if the country is grater than 10");
		
		countrypresidentMap.forEach((n,m)->{ System.out.println(n+" "+m);if(m.length()>10) {
			countrypresidentMap.replace("soundiarabiya","yang");
			}
		});
		
		
		
	}

}
