package com.noliveira.demo_park_api.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.noliveira.demo_park_api.entity.Usuario;

import java.util.List;


public interface UsuarioRepository extends JpaRepository<Usuario, Long> {


	Optional<Usuario> findByUsername(String username);

	@Query("select u.role from Usuario u where u.username like :username")
	Usuario.Role findRoleByUsername(String username);
	
}