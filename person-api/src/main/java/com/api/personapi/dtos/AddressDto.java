package com.api.personapi.dtos;

import javax.validation.constraints.Size;
import lombok.Data;

@Data
public class AddressDto {
	@Size(max = 130)
	private String logradouro;
	@Size(max = 10)
	private String numero;
	@Size(max = 20)
	private String Cep;
	@Size(max = 130)
	private String Cidade;
}
