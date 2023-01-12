package com.xworlz.Things;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;
@Component
public class HardWare {
	
	
	@Autowired
	@Qualifier("id")
	private int id;
	@Autowired
	@Qualifier("name")
	private String name;
	@Autowired 
	@Qualifier("gst")
	private int gstno;
	@Autowired
	@Qualifier("ownername")
	private String ownerName;
	@Autowired
	@Qualifier("address")
	private String address;
	
public void Hardware(){
	System.out.println("hardware strore is created by using spring");
	
}

@Override
public String toString() {
	return "HardwareStore [id=" + id + ", name=" + name + ", gstno=" + gstno + ", ownerName=" + ownerName + ", address="
			+ address + "]";
}


}
