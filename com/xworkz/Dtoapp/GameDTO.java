package com.xworkz.Dtoapp;

import java.io.Serializable;

public class GameDTO implements Serializable {
	
	
	public static void main(String[] args) {
		
		
					
			public GameDTO(String string, String string2) {
				// TODO Auto-generated constructor stub
			}

			private String name;
			private String typeofgame;
			private Integer totalplayers;
			private com.xworkz.Dtoapp.GameDTO references;

			public void GameDTO(String name,String typeofgame,Integer totalplayers) {
			 this.name=name;
			 this.typeofgame=typeofgame;
			 this.totalplayers=totalplayers;
			 
			}
	public boolean equals(Object reference) {
		if(reference!= null) {
			if(reference instanceof GameDTO) {
				GameDTO dto=(GameDTO) reference;
				if(dto.name.equals(this.name)) {
					return true;
				}
				
				
			}
		}
		return false;
	
		
		
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	

}
}
