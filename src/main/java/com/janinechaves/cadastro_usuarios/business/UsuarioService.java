package com.janinechaves.cadastro_usuarios.business;

import org.springframework.stereotype.Service;

import com.janinechaves.cadastro_usuarios.infrastructure.entitys.Usuario;
import com.janinechaves.cadastro_usuarios.infrastructure.repository.UsuarioRepository;


@Service
public class UsuarioService {

    private final UsuarioRepository repository;

    public UsuarioService(UsuarioRepository repository) {
        this.repository = repository;
    }

    public void salvarUsuario(Usuario usuario){
        repository.saveAndFlush(usuario);
    }

    public Usuario buscarUsuarioPorEmail(String email){

        return repository.findByEmail(email).orElseThrow(
                () -> new RuntimeException("Email não encontrado")
        );
    }

    public void deletarUsuarioPorEmail(String email){
        repository.deleteByEmail(email);
    }
    
    public void atualizarUsuarioPorId(Integer id, Usuario usuario) {
        Usuario usuarioEntity = repository.findById(id)
            .orElseThrow(() -> new RuntimeException("Usuário não encontrado"));
        
        if (usuario.getEmail() != null) {
            usuarioEntity.setEmail(usuario.getEmail());
        }

        if (usuario.getNome() != null) {
            usuarioEntity.setNome(usuario.getNome());
        }

        repository.saveAndFlush(usuarioEntity);
        
    }

}