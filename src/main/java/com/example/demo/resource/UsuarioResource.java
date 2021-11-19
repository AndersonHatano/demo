package com.example.demo.resource;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.NoArgsConstructor;

import javax.annotation.Resource;
import java.util.Date;

@Resource
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class UsuarioResource {

    private String nome;
    private String email;
    private String senha;
    private String celular;
    private Date dataNascimento;
    private String cpf;
    private Boolean prestador;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }

    public String getCelular() {
        return celular;
    }

    public void setCelular(String celular) {
        this.celular = celular;
    }

    public Date getDataNascimento() {
        return dataNascimento;
    }

    public void setDataNascimento(Date dataNascimento) {
        this.dataNascimento = dataNascimento;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public Boolean getPrestador() {
        return prestador;
    }

    public void setPrestador(Boolean prestador) {
        this.prestador = prestador;
    }
}
