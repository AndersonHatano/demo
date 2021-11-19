package com.example.demo.service;

import com.example.demo.domain.Horario;
import com.example.demo.domain.Servico;
import com.example.demo.domain.Usuario;
import com.example.demo.repositories.HorarioRepository;
import com.example.demo.repositories.ServicoRepository;
import com.example.demo.repositories.UsuarioRepository;
import com.example.demo.resource.HorarioResource;
import com.example.demo.resource.UsuarioResource;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.Optional;

@Service
public class HorarioService {

    @Autowired
    private HorarioRepository horarioRepository;

    @Autowired
    private UsuarioRepository usuarioRepository;

    @Autowired
    private ServicoRepository servicoRepository;

    @Transactional
    public Horario save(HorarioResource horarioResource){

        Horario horario = new Horario();

        horario.setHorario(horarioResource.getHorario());

        Optional<Servico> servico = servicoRepository.findById(horarioResource.getServicoId());

        Optional<Usuario> usuario = usuarioRepository.findById(horarioResource.getProfissionalId());

        horario.setCliente(usuario.get());
        horario.setServico(servico.get());

        return horarioRepository.save(horario);

    }
}
