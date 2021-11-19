package com.example.demo.controllers;

import com.example.demo.domain.Horario;
import com.example.demo.resource.HorarioResource;
import com.example.demo.service.HorarioService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HorarioController {

    @Autowired
    private HorarioService horarioService;

    @PostMapping("/horario")
    public Horario save(@RequestBody HorarioResource horarioResource){

        return horarioService.save(horarioResource);
    }

}
