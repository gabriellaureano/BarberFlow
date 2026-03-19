package com.gabriel.barberflow_api.repository;

import com.gabriel.barberflow_api.model.Agendamento;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AgendamentoRepository extends JpaRepository<Agendamento,Long> {
}
