package com.example.demo.service;

import com.example.demo.domain.Usuario;
import com.example.demo.repositories.UsuarioRepository;
import com.example.demo.resource.UsuarioResource;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;

@Service
public class UsuarioService {

    @Autowired
    private UsuarioRepository usuarioRepository;

    @Transactional
    public Usuario save(UsuarioResource usuarioResource){

        Usuario usuario = new Usuario();

        usuario.setNome(usuarioResource.getNome());
        usuario.setCelular(usuarioResource.getCelular());
        usuario.setCpf(usuarioResource.getCpf());
        usuario.setDataNascimento(usuarioResource.getDataNascimento());
        usuario.setEmail(usuarioResource.getEmail());
        usuario.setSenha(usuarioResource.getSenha());
        usuario.setPrestador(usuarioResource.getPrestador());

        return usuarioRepository.save(usuario);

    }
}
