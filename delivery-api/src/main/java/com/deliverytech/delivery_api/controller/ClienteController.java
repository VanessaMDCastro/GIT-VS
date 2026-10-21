package com.deliverytech.delivery_api.controller;

import com.deliverytech.delivery_api.controller.model.Cliente;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

/*
Definimos através da annotation de que esse arquivo trabalha com
requisições HTTP/HTTPS
*/
@RestController
public class ClienteController {
   
    /*Simular um banco de dados com uma lista de Cliente
    construir utilizando Spring Boot REST delivery_api
    através do nosso localhost:8080/cliente
    */
   @GetMapping("/cliente")
   public Cliente getCliente() {
    return new Cliente("joão","Silva");
   }
 
      // Simulando um banco de dados com uma lista de clientes
    // Retornando uma List
    // https://localhost:8080/clientes
    @GetMapping("/clientes")
    public List<Cliente> getClientes() {
        List<Cliente> clientes = new ArrayList<>();
        clientes.add(new Cliente("João", "Silva", "(11) 98765-4321"));
        clientes.add(new Cliente("Maria", "Souza", "(21) 99876-5432"));
        clientes.add(new Cliente("Pedro", "Oliveira", "(31) 99777-1234"));
        return clientes;
    }
 
    // O valor na URL diretamente injetado no método
    // http://localhost:8080/cliente/João/Silva
    @GetMapping("/cliente/{nome}/{sobrenome}/{telefone}")
    public Cliente getClienteByPathVariable(@PathVariable String nome, @PathVariable String sobrenome @PathVariable String telefone) {
        return new Cliente(nome, sobrenome, telefone);
    }
 
    // build onde os valores são passados como query params
    // https://localhost:8080/cliente/query?nome=João&sobrenome=Silva
    @GetMapping("/cliente/query")
    public Cliente getClienteByQueryParam(
        @RequestParam String nome, @RequestParam String sobrenome, @RequestParam String telefone) {
        return new Cliente(nome, sobrenome, telefone);
    }
 
}
