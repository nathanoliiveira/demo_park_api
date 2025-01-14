package com.noliveira.demo_park_api.web.controller.dto.mapper;

import org.modelmapper.ModelMapper;

import com.noliveira.demo_park_api.entity.Cliente;
import com.noliveira.demo_park_api.web.controller.dto.ClienteCreateDto;
import com.noliveira.demo_park_api.web.controller.dto.ClienteResponseDto;

import lombok.AccessLevel;
import lombok.NoArgsConstructor;

@NoArgsConstructor(access = AccessLevel.PRIVATE)
public class ClienteMapper {
	
	public static Cliente toCliente(ClienteCreateDto dto) {
		return new ModelMapper().map(dto, Cliente.class);
	}

	public static ClienteResponseDto toDto(Cliente cliente) {
		return new ModelMapper().map(cliente, ClienteResponseDto.class);
	}
}
