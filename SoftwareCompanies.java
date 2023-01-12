package com.xworkz.collectionapp;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

public class SoftwareCompanies {
	
	public static void main(String[] args) {
		 String comp1="Microsoft";
		 String comp2="Adobe";
		 String comp3="Twilio";
		 String comp4="Genesys";
		 String comp5="Nutanix";
		 String comp6="MathWorks";
		 String comp7="Qualtrics";
		 String comp8="Cvent";
		 String comp9="SnowFlake";
		 String comp110="Zscaler";
		 String comp12="purestorage";
		 String comp13="ui-path";
		 String comp14="GitHub";
		 String comp15="MongoDB";
		 String comp16="Dropbox";
		 String comp17="databricks";
		 String comp18="Altimetrik";
		 String comp19="DataDog";
		 String comp20="slack";
		 
		 Collection<String> SoftwareCompanies=new ArrayList<String>();
		 SoftwareCompanies.add(comp20);
		 SoftwareCompanies.add(comp19);
		 SoftwareCompanies.add(comp18);
		 SoftwareCompanies.add(comp17);
		 SoftwareCompanies.add(comp16);
		 SoftwareCompanies.add(comp15);
		 SoftwareCompanies.add(comp14);
		 SoftwareCompanies.add(comp13);
		 SoftwareCompanies.add(comp12);
		 SoftwareCompanies.add(comp1);
		 SoftwareCompanies.add(comp1);
		 SoftwareCompanies.add(comp9);
		 SoftwareCompanies.add(comp8);
		 SoftwareCompanies.add(comp7);
		 SoftwareCompanies.add(comp6);
		 SoftwareCompanies.add(comp5);
		 SoftwareCompanies.add(comp4);
		 SoftwareCompanies.add(comp3);
		 SoftwareCompanies.add(comp2);
		 SoftwareCompanies.add(comp1);
		 
			
		 for(String element:SoftwareCompanies)
			{
				System.out.println(element);
			}
			System.out.println("*******Iterator*******");
			
			Iterator<String> itr=SoftwareCompanies.iterator();
			//using methods without knowing impl
			
			while(itr.hasNext())
			{
				String element=itr.next();
				System.out.println(element);
		 
	}

}
}
