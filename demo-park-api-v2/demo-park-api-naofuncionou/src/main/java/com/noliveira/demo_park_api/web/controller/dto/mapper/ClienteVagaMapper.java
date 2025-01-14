package com.noliveira.demo_park_api.web.controller.dto.mapper;

import org.modelmapper.ModelMapper;

import com.noliveira.demo_park_api.entity.ClienteVaga;
import com.noliveira.demo_park_api.web.controller.dto.EstacionamentoCreateDto;
import com.noliveira.demo_park_api.web.controller.dto.EstacionamentoResponseDto;

import lombok.AccessLevel;
import lombok.NoArgsConstructor;

@NoArgsConstructor(access = AccessLevel.PRIVATE)
public class ClienteVagaMapper {
	
	public static ClienteVaga toClienteVaga(EstacionamentoCreateDto dto) {
		return new ModelMapper().map(dto, ClienteVaga.class);
	}
	
	public static EstacionamentoResponseDto toDto(ClienteVaga clienteVaga) {
		return new ModelMapper().map(clienteVaga, EstacionamentoResponseDto.class);		
	}
	
}
