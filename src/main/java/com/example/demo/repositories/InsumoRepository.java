package com.example.demo.repositories;

import com.example.demo.domain.Insumo;
import com.example.demo.domain.Servico;
import org.springframework.data.jpa.repository.JpaRepository;

public interface InsumoRepository extends JpaRepository<Insumo, Long> {
}
