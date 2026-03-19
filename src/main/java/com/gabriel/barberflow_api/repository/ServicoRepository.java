package com.gabriel.barberflow_api.repository;

import com.gabriel.barberflow_api.model.Servico;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ServicoRepository extends JpaRepository<Servico,Long> {
}
