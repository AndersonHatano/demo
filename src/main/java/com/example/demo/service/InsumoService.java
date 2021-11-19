package com.example.demo.service;

import com.example.demo.domain.Insumo;
import com.example.demo.domain.Servico;
import com.example.demo.domain.Usuario;
import com.example.demo.repositories.InsumoRepository;
import com.example.demo.repositories.ServicoRepository;
import com.example.demo.repositories.UsuarioRepository;
import com.example.demo.resource.InsumoResource;
import com.example.demo.resource.UsuarioResource;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.Optional;

@Service
public class InsumoService {

    @Autowired
    private InsumoRepository insumoRepository;

    @Autowired
    private ServicoRepository servicoRepository;

    @Transactional
    public Insumo save(InsumoResource insumoResource){

        Insumo insumo = new Insumo();

        insumo.setNome(insumoResource.getNome());
        insumo.setQuantidade(insumoResource.getQuantidade());

        Optional<Servico> servico = servicoRepository.findById(insumoResource.getServicoId());

        insumo.setServico(servico.get());

        return insumoRepository.save(insumo);

    }
}
