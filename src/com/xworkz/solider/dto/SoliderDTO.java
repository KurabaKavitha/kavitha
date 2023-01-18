package com.xworkz.solider.dto;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Size;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.NonNull;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@ToString

public class SoliderDTO  extends AbstractAudiDTO{
	@NonNull
	@NotBlank
	@Size(min=3,max=20)
	
	private String name;
	private int id;
	private String rank;
	private String batallion;
	private String country;
	

}
