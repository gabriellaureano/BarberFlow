package com.gabriel.barberflow_api.controller;

import com.gabriel.barberflow_api.dto.UsuarioRequestDTO;
import com.gabriel.barberflow_api.dto.UsuarioResponseDTO;
import com.gabriel.barberflow_api.service.UsuarioService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/barberflow")
public class UsuarioController {

    private final UsuarioService usuarioService;

    public UsuarioController(UsuarioService usuarioService) {
        this.usuarioService = usuarioService;
    }

    @PostMapping("/usuarios")
    public UsuarioResponseDTO cadastrar(@RequestBody UsuarioRequestDTO usuarioRequestDTO){
        return usuarioService.cadastrar(usuarioRequestDTO);
    }

    @GetMapping("/usuarios")
    public List<UsuarioResponseDTO> listarUsuarios(){
        return usuarioService.listarUsuarios();
    }
}
