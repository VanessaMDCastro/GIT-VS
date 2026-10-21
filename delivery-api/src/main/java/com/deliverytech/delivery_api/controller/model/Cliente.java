package com.deliverytech.delivery_api.controller.model;

public class Cliente {
   
    private String nome;
    private String sobrenome;
    private String telefone;
 
    public Cliente(String nome, String sobrenome, String telefone) {
        this.nome = nome;
        this.sobrenome = sobrenome;
        this.telefone = telefone;
    }
 
    public String getNome() {
        return nome;
    }
 
    public String setNome(String nome) {
        this.nome = nome;
        return nome;
    }
 
    public String getSobrenome() {
        return sobrenome;
    }
 
    public String setSobrenome(String sobrenome) {
        this.sobrenome = sobrenome;
        return sobrenome;
    }
    public String getTelefone() {
        return telefone;
    }
    public setTelefone(String telefone){
        this.telefone = telefone;
        return telefone;
    }


}
