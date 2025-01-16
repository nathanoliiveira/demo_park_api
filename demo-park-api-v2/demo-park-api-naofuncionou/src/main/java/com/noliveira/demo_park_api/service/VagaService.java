package com.noliveira.demo_park_api.service;

import org.springframework.dao.DataIntegrityViolationException;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.noliveira.demo_park_api.entity.Vaga;
import com.noliveira.demo_park_api.exception.CodigoUniqueViolationException;
import com.noliveira.demo_park_api.exception.EntityNotFoundException;
import com.noliveira.demo_park_api.exception.VagaDisponivelException;
import com.noliveira.demo_park_api.repository.VagaRepository;
import com.noliveira.demo_park_api.entity.Vaga.StatusVaga;

import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
@Service
public class VagaService {
	
	private final VagaRepository vagaRepository;
	
	@Transactional
	public Vaga salvar(Vaga vaga) {
		try {
			return vagaRepository.save(vaga);
		} catch (DataIntegrityViolationException ex) {
			throw new CodigoUniqueViolationException("Vaga", vaga.getCodigo());
		}
	}
	
	@Transactional(readOnly = true)
    public Vaga buscarPorCodigo(String codigo) {
        return vagaRepository.findByCodigo(codigo).orElseThrow(
                () -> new EntityNotFoundException("Vaga", codigo)
        );
    }

	@Transactional(readOnly = true)
	public Vaga buscarPorVagaLivre() {
		return vagaRepository.findFirstByStatus(StatusVaga.LIVRE).orElseThrow(
				() -> new VagaDisponivelException()
		);
	}
	
}
