package com.xworkz.components;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class Engine {
	private String name;
	private String type;
	@Value("102")
	private int number;
	@Value("21.25")
	private double version;
	private String company;
	private String strokes;
	
	

	public Engine(@Qualifier("name1")String name,@Qualifier("type1") String type,@Qualifier("company") String company) {
		super();
		this.name = name;
		this.type = type;
		this.company = company;
	}
	

	

	@Override
	public String toString() {
		
		return "Engine[name="+name+",type="+type+",number="+number+",version="+version+","
				+ "company="+company+",stroke="+strokes+"]";
	}
	
	
	

}
