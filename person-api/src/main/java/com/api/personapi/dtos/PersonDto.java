package com.api.personapi.dtos;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Size;
import lombok.Data;

@Data
public class PersonDto {
	
	@NotBlank
	@Size(max = 130)
	private String nome;
	
	@NotBlank
	private String birthDate;
}
