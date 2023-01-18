package com.xworkz.solider.dto;

import java.io.Serializable;
import java.time.LocalDateTime;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Setter
@Getter
@ToString
@AllArgsConstructor
@NoArgsConstructor
public abstract class AbstractAudiDTO implements Serializable {
	
	private String createdby;
	private LocalDateTime createdAt;
	private String updateby;
	private LocalDateTime updateAt;
	
	
	
	

}
