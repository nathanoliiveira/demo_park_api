package com.noliveira.demo_park_api.service;
import com.noliveira.demo_park_api.entity.Usuario;
import com.noliveira.demo_park_api.entity.Usuario.Role;
import com.noliveira.demo_park_api.exception.EntityNotFoundException;
import com.noliveira.demo_park_api.exception.PasswordInvalidException;
import com.noliveira.demo_park_api.exception.UsernameUniqueViolationException;
import com.noliveira.demo_park_api.repository.UsuarioRepository;

import lombok.RequiredArgsConstructor;

import java.util.List;

import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.security.web.webauthn.management.MapPublicKeyCredentialUserEntityRepository;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;


@RequiredArgsConstructor
@Service
public class UsuarioService {

	private final UsuarioRepository usuarioRepository;

	private final PasswordEncoder passwordEncoder;
	
	
	@Transactional
	public Usuario salvar(Usuario usuario) {
		try{
			usuario.setPassword(passwordEncoder.encode(usuario.getPassword()));
			return usuarioRepository.save(usuario);
		} catch (org.springframework.dao.DataIntegrityViolationException ex) {
			throw new UsernameUniqueViolationException(String.format("Username {%s} já cadastrado", usuario.getUsername()));        
		}
	}

	@Transactional(readOnly = true)
	public Usuario buscarPorId(Long id) {
		return usuarioRepository.findById(id).orElseThrow(
				() -> new EntityNotFoundException(String.format("Usuário id=%s não encontrado.",id))
				);
	}

	@Transactional
	public Usuario editarSenha(Long id, String senhaAtual, String novaSenha, String confirmaSenha) {
		if (!novaSenha.equals(confirmaSenha)) {
			throw new PasswordInvalidException("Nova senha não confere com confirmação de senha.");
		}
		Usuario user = buscarPorId(id);
		if (!passwordEncoder.matches(senhaAtual, user.getPassword())) {
			throw new PasswordInvalidException("Sua senha não confere.");
		}
		user.setPassword(passwordEncoder.encode(novaSenha));
		return user;
	} 

	@Transactional(readOnly = true)
	public List<Usuario> buscarTodos() {
		return usuarioRepository.findAll();
	}
	
	@Transactional(readOnly = true)
	public Usuario buscarPorUsername(String username) {
		return usuarioRepository.findByUsername(username).orElseThrow(
				() -> new EntityNotFoundException(String.format("Usuário com '%s' não encontrado.",username))
		);
	}

	@Transactional(readOnly = true)
	public Usuario.Role buscarRolePorUsername(String username) {
		return usuarioRepository.findRoleByUsername(username);
	}
}
