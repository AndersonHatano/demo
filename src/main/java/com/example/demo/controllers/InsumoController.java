package com.example.demo.controllers;

import com.example.demo.domain.Insumo;
import com.example.demo.resource.InsumoResource;
import com.example.demo.service.InsumoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class InsumoController {

    @Autowired
    private InsumoService insumoService;

    @PostMapping("/insumo")
    public Insumo save(@RequestBody InsumoResource insumoResource){

        return insumoService.save(insumoResource);
    }

}
