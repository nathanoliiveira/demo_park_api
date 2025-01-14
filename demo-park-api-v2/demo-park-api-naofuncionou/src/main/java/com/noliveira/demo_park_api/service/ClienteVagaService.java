package com.noliveira.demo_park_api.service;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.noliveira.demo_park_api.entity.ClienteVaga;
import com.noliveira.demo_park_api.repository.ClienteVagaRepository;

import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
@Service
public class ClienteVagaService {
	
	private final ClienteVagaRepository repository;
	
	@Transactional
	public ClienteVaga salvar(ClienteVaga clienteVaga) {
		return repository.save(clienteVaga);
	}
	
}
