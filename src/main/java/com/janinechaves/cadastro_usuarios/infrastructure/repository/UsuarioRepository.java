package com.janinechaves.cadastro_usuarios.infrastructure.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.transaction.annotation.Transactional;

import com.janinechaves.cadastro_usuarios.infrastructure.entitys.Usuario;

import java.util.Optional;

public interface UsuarioRepository extends JpaRepository<Usuario, Integer> {

    Optional<Usuario> findByEmail(String email);

    @Transactional
    void deleteByEmail(String email);
}
