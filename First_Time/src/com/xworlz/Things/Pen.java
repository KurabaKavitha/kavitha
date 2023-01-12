package com.xworlz.Things;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class Pen {
	
	@Autowired
	@Qualifier("name5")
	private String name;
	@Autowired
	@Qualifier("type")
	private String type;
	@Autowired
	@Qualifier("price1")
	private int price;
	@Autowired
	@Qualifier("color2")
	private String color;
	@Autowired
	@Qualifier("sharp2")
	private boolean sharp;
	@Autowired
	@Qualifier("stolean1")
	private boolean stolean;
	@Override
	public String toString() {
		return "Pen [name=" + name + ", type=" + type + ", price=" + price + ", color=" + color + ", sharp=" + sharp
				+ ", stolean=" + stolean + "]";

}
}
