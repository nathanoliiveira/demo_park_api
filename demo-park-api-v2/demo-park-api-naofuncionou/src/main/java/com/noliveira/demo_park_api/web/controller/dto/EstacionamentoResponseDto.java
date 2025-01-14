package com.noliveira.demo_park_api.web.controller.dto;

import java.math.BigDecimal;
import java.time.LocalDateTime;

import org.hibernate.validator.constraints.br.CPF;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Pattern;
import jakarta.validation.constraints.Size;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter @Setter @NoArgsConstructor @AllArgsConstructor
public class EstacionamentoResponseDto {
	private String placa;
	private String marca;
	private String modelo;
	private String cor;
	private String clienteCpf;
	private String recibo;
	private LocalDateTime dataEntrada;
	private LocalDateTime dataSaida;
	private String vagaCodigo;
	private BigDecimal valor;
	private BigDecimal desconto;
}
