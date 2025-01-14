package com.noliveira.demo_park_api.web.controller.dto.mapper;

import org.modelmapper.ModelMapper;

import com.noliveira.demo_park_api.entity.Vaga;
import com.noliveira.demo_park_api.web.controller.dto.VagaCreateDto;
import com.noliveira.demo_park_api.web.controller.dto.VagaResponseDto;

import lombok.AccessLevel;
import lombok.NoArgsConstructor;

@NoArgsConstructor(access = AccessLevel.PRIVATE)
public class VagaMapper {
	
	public static Vaga toVaga(VagaCreateDto dto) {
		return new ModelMapper().map(dto, Vaga.class);
	}
	
	public static VagaResponseDto toDto(Vaga vaga) {
		return new ModelMapper().map(vaga, VagaResponseDto.class);
	}
	
}