package com.noliveira.demo_park_api.web.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;

import com.noliveira.demo_park_api.entity.ClienteVaga;
import com.noliveira.demo_park_api.service.EstacionamentoService;
import com.noliveira.demo_park_api.web.controller.dto.EstacionamentoCreateDto;
import com.noliveira.demo_park_api.web.controller.dto.EstacionamentoResponseDto;
import com.noliveira.demo_park_api.web.controller.dto.mapper.ClienteVagaMapper;

import jakarta.validation.Valid;
import lombok.RequiredArgsConstructor;

import java.net.URI;

import org.springframework.http.ResponseEntity;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;


@RequiredArgsConstructor
@RestController
@RequestMapping("api/v1/estacionamentos")
public class EstacionamentoController {
	
	private final EstacionamentoService estacionamentoService;
	
	@PostMapping("/check-in")
	@PreAuthorize("hasRole('ADMIN')")
	public ResponseEntity<EstacionamentoResponseDto> checkin(@RequestBody @Valid EstacionamentoCreateDto dto) {
		ClienteVaga clienteVaga = ClienteVagaMapper.toClienteVaga(dto);
		estacionamentoService.checkIn(clienteVaga);
		EstacionamentoResponseDto responseDto = ClienteVagaMapper.toDto(clienteVaga);
		URI location = ServletUriComponentsBuilder
				.fromCurrentRequestUri().path("/{recibo}")
				.buildAndExpand(clienteVaga.getRecibo())
				.toUri();
		
		return ResponseEntity.created(location).body(responseDto);
	}
	
}
