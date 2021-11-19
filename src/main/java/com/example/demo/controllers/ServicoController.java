package com.example.demo.controllers;

import com.example.demo.domain.Servico;
import com.example.demo.resource.ServicoResource;
import com.example.demo.service.ServicoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ServicoController {

    @Autowired
    private ServicoService servicoService;

    @PostMapping("/servico")
    public Servico save(@RequestBody ServicoResource servicoResource){

        return servicoService.save(servicoResource);
    }

}
