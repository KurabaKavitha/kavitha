package com.xworkz.configuration;

import java.time.LocalDate;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
@Configuration
@ComponentScan("com.xworkz.components")

public class Spring4configuration {
	
	
		
	@Bean
	public String name() {
		
		return "Andhrajothi";
	}
	@Bean
	public String lang() {
		return "telugu";
	}
	@Bean
	public String ownerName() {
		return "rajashakerreddy";
	}
	@Bean
	public String type1() {
		return "motar";
	}
	@Bean
	public String name1() {
		return "bajajmotor";
	}
	@Bean
	public String company() {
		return "bajaj";
	}
	@Bean
	public String name2() {
		return "cobra";
	}
	@Bean
	public String type3() {
		return "watersnake";
	}
	@Bean
	public boolean isPosionous() {
		return true;
	}
	
	@Bean
	public LocalDate date() {
		return LocalDate.of(2000, 3, 12);
		
	}
	@Bean
	public boolean isSuside() {
		return true;
	}
	@Bean
	public String schhool() {
		return "prathibha schhool";
	}
	@Bean
	public String grandfather() {
		return "venkteswarao";
	}
	@Bean
	public String grandMother() {
		return "ramanjinamma";
	}
	@Bean
	public String friendName() {
		return "spurthi";
	}
	@Bean
	public String murderName() {
		return "abhi";
	}
	@Bean
	public String collegename() {
		return "rymec";
	}
	
	
	
	
}
