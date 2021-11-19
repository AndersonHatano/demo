package com.example.demo.controllers;

import com.example.demo.domain.Usuario;
import com.example.demo.resource.UsuarioResource;
import com.example.demo.service.UsuarioService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UsuarioController {

    @Autowired
    private UsuarioService usuarioService;

    @PostMapping("/usuario")
    public Usuario save(@RequestBody UsuarioResource usuarioResource){

        return usuarioService.save(usuarioResource);
    }

}
