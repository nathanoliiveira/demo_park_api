package com.noliveira.demo_park_api.web.controller.dto;

import org.hibernate.validator.constraints.br.CPF;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Pattern;
import jakarta.validation.constraints.Size;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter @Setter @NoArgsConstructor @AllArgsConstructor
public class EstacionamentoCreateDto {
	@NotBlank
	@Size(min = 8, max = 8)
	@Pattern(regexp = "[A-Z]{3}-[0-9]{4}", message = "A placa do veículo deve seguir padrão 'XXX-0000'")
	private String placa;
	@NotBlank
	private String marca;
	@NotBlank
	private String modelo;
	@NotBlank
	private String cor;
	@NotBlank
	@Size(min = 11, max = 11)
	@CPF
	private String clienteCpf;	
}
