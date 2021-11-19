package com.example.demo.repositories;

import com.example.demo.domain.Horario;
import com.example.demo.domain.Servico;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ServicoRepository extends JpaRepository<Servico, Long> {
}
