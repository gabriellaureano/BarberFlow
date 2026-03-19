package com.gabriel.barberflow_api.repository;

import com.gabriel.barberflow_api.model.Usuario;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UsuarioRepository extends JpaRepository<Usuario,Long> {
}
