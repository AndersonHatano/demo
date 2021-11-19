package com.example.demo.service;

import com.example.demo.domain.Servico;
import com.example.demo.domain.Usuario;
import com.example.demo.repositories.ServicoRepository;
import com.example.demo.repositories.UsuarioRepository;
import com.example.demo.resource.ServicoResource;
import com.example.demo.resource.UsuarioResource;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.imageio.spi.ServiceRegistry;
import javax.transaction.Transactional;
import java.util.Optional;

@Service
public class ServicoService {

    @Autowired
    private ServicoRepository servicoRepository;

    @Autowired
    private UsuarioRepository usuarioRepository;

    @Transactional
    public Servico save(ServicoResource servicoResource){

        Servico servico = new Servico();

        servico.setNome(servicoResource.getNome());
        servico.setValor(servicoResource.getValor());
        servico.setDataRemocao(null);
        servico.setAtivo(true);

        Optional<Usuario> usuario = usuarioRepository.findById(servicoResource.getUsuarioId());

        servico.setUsuario(usuario.get());

        return servicoRepository.save(servico);

    }
}
