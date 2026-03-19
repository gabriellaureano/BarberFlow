package com.gabriel.barberflow_api.service;

import com.gabriel.barberflow_api.dto.UsuarioRequestDTO;
import com.gabriel.barberflow_api.dto.UsuarioResponseDTO;
import com.gabriel.barberflow_api.model.TipoUsuario;
import com.gabriel.barberflow_api.model.Usuario;
import com.gabriel.barberflow_api.repository.UsuarioRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UsuarioService {

    private final UsuarioRepository usuarioRepository;

    public UsuarioService(UsuarioRepository usuarioRepository) {
        this.usuarioRepository = usuarioRepository;
    }

    public UsuarioResponseDTO cadastrar(UsuarioRequestDTO usuarioRequestDTO){
        Usuario usuario = new Usuario();

        usuario.setNome(usuarioRequestDTO.nome());
        usuario.setEmail(usuarioRequestDTO.email());
        usuario.setSenha(usuarioRequestDTO.senha());
        usuario.setTipoUsuario(TipoUsuario.CLIENTE);

        usuarioRepository.save(usuario);

        return new UsuarioResponseDTO(
                usuario.getId(),
                usuario.getNome(),
                usuario.getEmail()
        );
    }

    public List<UsuarioResponseDTO> listarUsuarios(){
        return usuarioRepository.findAll().stream()
                .map(usuario -> new UsuarioResponseDTO(
                        usuario.getId(),
                        usuario.getNome(),
                        usuario.getEmail()
                ))
                .toList();
    }
}
