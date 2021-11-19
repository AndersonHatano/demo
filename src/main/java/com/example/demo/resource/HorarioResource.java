package com.example.demo.resource;

import com.example.demo.domain.Servico;
import com.example.demo.domain.Usuario;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.NoArgsConstructor;

import javax.annotation.Resource;
import javax.persistence.ManyToOne;
import java.util.TimeZone;

@Resource
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class HorarioResource {

    private TimeZone horario;

    private Long profissionalId;

    private Long servicoId;

    public TimeZone getHorario() {
        return horario;
    }

    public void setHorario(TimeZone horario) {
        this.horario = horario;
    }

    public Long getProfissionalId() {
        return profissionalId;
    }

    public void setProfissionalId(Long profissionalId) {
        this.profissionalId = profissionalId;
    }

    public Long getServicoId() {
        return servicoId;
    }

    public void setServicoId(Long servicoId) {
        this.servicoId = servicoId;
    }
}
