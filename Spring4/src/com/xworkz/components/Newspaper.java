package com.xworkz.components;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class Newspaper {
	@Value("258")
	private int id;
	private String name;
	private String ownerName;
	@Value("telugu")
	private String language;
	private int price;
	@Autowired
	public void newsPaper(@Qualifier("name") String name, @Qualifier("ownerName")String ownerName) {
		System.out.println("paramiteerconstructor is created by using spring");
		this.name=name;
		this.ownerName=ownerName;
	}
	public void setPrice(@Value("258")int price) {
		this.price=price;
		
	}
	@Override
	public String toString() {
		return "NewsPaper [id=" + id + ", name=" + name + ", ownerName=" + ownerName + ", language=" + language
				+ ", price=" + price + "]";
	}

}
